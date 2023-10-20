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

static int count;
void* thread_main(void* arg) {
    printf("[child] start\n");
    usleep(50000);
    int N2;
    printf("Enter a number [10;20]: \n");
    scanf("%d", &N2);
    if (N2 < 10 || N2 > 20) {
        printf("N2 must be a positive number\n");
        exit(EXIT_FAILURE);
    }
    while(count != N2) {
        printf("Numero = %d\n", count);
        count++;
        usleep(50000);
    }
    printf("[child] end\n");
    return NULL;
}

int main(int argc, char* argv[]) {
    printf("[main] start\n");
    int N1;
    pthread_t thread;
    printf("Enter a number [1;9]: \n");
    scanf("%d", &N1);
    if (N1 < 0 || N1 > 9) {
        printf("N1 must be a positive number\n");
        exit(EXIT_FAILURE);
    }        
    int* NR = (int*) malloc(sizeof(int));
    count = N1;
    thread_create(&thread, NULL, thread_main, NR);
    thread_join(thread, NULL);
    while(count > 0) {
        printf("Numero = %d\n", count);
        count--;
        usleep(50000);
    }
    printf("[main] end\n");
    return 0;
}