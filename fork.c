
#include <sys/types.h>
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main()
{
  pid_t check=getpid();
  int i = 0;
  int childID = 0;

  for (i = 0; i < 10; i++)
  {
   
    if(check < 0)
    {
      printf("fork failed");
      exit(-1);
    }
    if (check > 0)
    {
          childID = i+1;
          check = fork();
    }
    if(check == 0)
    {
      break;
    }

  }
    if (check == 0)
    {
        printf("I'm child no %d \n", childID);
        exit(0);
    }
}
