#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

#include "delays.h"
#include "process.h"


int main(void)
{   
    printf("Before the fork: PID = %d, PPID = %d\n", getpid(), getppid());

    int counter = 1;
    int i = 0;
    pid_t ret = pfork();

    for (i = 0; i <= 9; i++) {
        if (ret == 0) {
            printf(" I'm the child: counter = %d\n", counter);
            counter++;
        }
    }

    for (i = 0; i <= 9; i++) {
        if (9 < counter ) {
                printf(" I'm the parent: counter = %d\n", counter);
                counter++;
        }       
    }

    return EXIT_SUCCESS;
}