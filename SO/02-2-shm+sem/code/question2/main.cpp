#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>

#include "delays.h"
#include "process.h"

int main (void)
{
    
    int counter;
    printf("lim it: ");
    scanf("%d", &counter);

    int smh_id = shmget(IPC_PRIVATE, 20, IPC_CREAT | 0600);
    
    int sem_id = psemget(IPC_PRIVATE, 3, IPC_CREAT | 0600);
    pid_t ret = pfork();
    
    if (ret == 0) {
        for (int i = 0; i < 10; i++)
        {
            psem_up(sem_id, 0);
            printf("lim it: " );
            scanf("%d", &counter);
        }
    } else {
        for (int i = 10; i<20;i++) {
            psem_up(sem_id,0);
            printf("lim it: " );
            scanf("%d", &counter);
        }
    }
    return EXIT_SUCCESS;
}