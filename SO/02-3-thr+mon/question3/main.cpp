#include <stdio.h>
#include <unistd.h>
#include <stdint.h>
#include <math.h>
#include <libgen.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>

#include "thread.h"
#include "bwdelay.h"

#include <stdio.h>
#include <stdlib.h>
#include "thread.h"

#define NUM_THREADS 2


static pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;
static pthread_cond_t cond = PTHREAD_COND_INITIALIZER;

static int* counter;

void* thread_main1(void* arg) {

    int pid = getpid(); // Get the process ID
    while (*counter > 1) {
        pthread_mutex_lock(&mutex);
        while (*counter % 2 == 0) {
            pthread_cond_wait(&cond, &mutex); // Wait until counter > 0
        }
        (*counter)--;
        printf("Process %d (Child 1): Counter is now %d\n", pid, *counter);
        pthread_mutex_unlock(&mutex);
        usleep(500000);
    }
    return NULL;
}

void* thread_main2(void* arg) {
    int pid = getpid(); // Get the process ID
    while (*counter > 1) {
        pthread_mutex_lock(&mutex);
        while (*counter % 2 != 0) {
            pthread_cond_wait(&cond, &mutex); // Wait until counter > 0
        }
        (*counter)--;
        printf("Process %d (Child 2): Counter is now %d\n", pid, *counter);
        pthread_mutex_unlock(&mutex);
        usleep(500000);
    }
    return NULL;
}

int main() {
    printf("[main] start\n");
    int N1;
    pthread_t child1, child2;
    printf("Enter a number [10;20]: \n");
    scanf("%d", &N1);
    if (N1 < 10 || N1 > 20) {
        printf("N1 must be a positive number, greater than 10 and lower than 20\n");
        exit(EXIT_FAILURE);
    }        
    counter = (int *)malloc(sizeof(int));
    if (counter == NULL) {
        perror("Error allocating memory");
        exit(1);
    }
    *counter = N1; // Initialize counter with the user input value

    // Create and start the increment thread
    if (pthread_create(&child1, NULL, thread_main1, NULL) != 0) {
        perror("Error creating increment thread");
        free(counter);
        exit(1);
    }

    // Create and start the decrement thread
    if (pthread_create(&child2, NULL, thread_main2, NULL) != 0) {
        perror("Error creating decrement thread");
        free(counter);
        exit(1);
    }

    // Wait until both child threads terminate
    pthread_join(child1, NULL);
    pthread_join(child2, NULL);

    // Release resources and terminate
    free(counter);
    pthread_mutex_destroy(&mutex);
    pthread_cond_destroy(&cond);
    printf("Main end\n");
    return 0;
}
