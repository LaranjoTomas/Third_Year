#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

#include "process.h"

#define NUM_THREADS 2

static int count = 0;

static pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;
static pthread_cond_t cond = PTHREAD_COND_INITIALIZER;

void* thread_main(void* arg) {
    
    int id = *(int*)arg;
    printf("[thread_main %d] start\n", id);

    while (1) {
        // Acquire mutex
        pthread_mutex_lock(&mutex);

        while (count % NUM_THREADS != id) {
            pthread_cond_wait(&cond, &mutex);
        }

        if (count == 1) {
            pthread_mutex_unlock(&mutex);
            break;
        }

        count--;
        printf("%d, PID = %d\n", count, getpid());

        pthread_cond_broadcast(&cond);

        pthread_mutex_unlock(&mutex);
    }

    printf("[thread_main %d] end\n", id);
    return NULL;
}

int main(void) {
    // Ask user for value between 10 and 20
    int n;
    do {
        printf("Enter a value between 10 and 20: ");
        scanf("%d", &n);
    } while (n < 10 || n > 20);

    count = n;
    pthread_mutex_init(&mutex, NULL);
    pthread_cond_init(&cond, NULL);

    pthread_t threads[NUM_THREADS];
    int thread_ids[NUM_THREADS];
    for (int i = 0; i < NUM_THREADS; i++) {
        thread_ids[i] = i;
        if (pthread_create(&threads[i], NULL, thread_main, &thread_ids[i]) != 0) {
            perror("pthread_create");
            exit(EXIT_FAILURE);
        }
    }

    for (int i = 0; i < NUM_THREADS; i++) {
        if (pthread_join(threads[i], NULL) != 0) {
            perror("pthread_join");
            exit(EXIT_FAILURE);
        }
    }

    // Release resources
    pthread_mutex_destroy(&mutex);
    pthread_cond_destroy(&cond);

    // Terminate
    exit(EXIT_SUCCESS);
}