#include<stdio.h>
int dec_to_bin(int n)
{
   //Your code goes here
  int bits;
  while(n != 0)
  {
    n=n/2;
    bits++;
  }
  return bits;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
