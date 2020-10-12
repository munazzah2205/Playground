#include <stdio.h>

int main() 
{
  
    int i = 65;
    int k = 120;
  int temp;
    printf("%d %d\n", i, k);
    temp=i;
    i = k;
    k = temp;
    printf("%d %d", i, k);

    return 0;
}
