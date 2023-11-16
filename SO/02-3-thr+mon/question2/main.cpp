/*
 * An implementation of the bounded-buffer problem
 *
 * NC producers and NC consumers communicate through a fifo.
 * The fifo has a fixed capacity, defined at its creation.
 * NI items will be produced by the producers and consume by the consumers.
 * An item is composed of 2 equal integers, ranging from 1 to NI.
 * A busy waiting delay is inserted between the insertion/retrieval of the 2 integers in the fifo.
 */

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

pthread_mutex_t mutex;
pthread_cond_t cond;

static int* count;
void* thread_main(void* arg) {
    printf("[child] start\n");
    pthread_mutex_lock(&mutex);
    int N2;
    printf("Number for iteration, number must be [10;20]: \n");
    scanf("%d", &N2);

    if (N2 < 10 || N2 > 20) {
        printf("Number does not meet the criteria!\n");
        return 0;
    }

    while(*count < N2) {
        (*count)++;
        printf("Shared variable new value is : %d\n", *count);
    }
    
    printf("[child] end\n");
    pthread_mutex_unlock(&mutex);
    return NULL;
}

int main(int argc, char* argv[]) {
    printf("[main] start\n");
    pthread_t thread;
    int N1;
    printf("Number for iteration, number must be [1;9]: \n");
    scanf("%d", &N1);

    if (N1 < 1 || N1 > 9) {
        printf("Number does not meet the criteria!\n");
        return 0;
    }

    count = (int*) malloc(sizeof(int));
    if (count == NULL) {
        perror("Error allocating memory");
        exit(1);
    }
    *count = N1;

    pthread_create(&thread, NULL, thread_main, (void*) count);

    pthread_join(thread, NULL);

    while(*count > 0 ) {
        printf("Shared variable new value: %d\n", *count);
        (*count)--;
    }

    free(count);
    pthread_mutex_destroy(&mutex);
    pthread_cond_destroy(&cond);
    printf("[main] end\n");
    return 0;
}