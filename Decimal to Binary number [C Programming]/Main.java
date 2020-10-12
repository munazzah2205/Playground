#include<stdio.h>
int dec_to_bin(int n)
{
   //Your code goes here
  int binary,i=1;
  while(n!=0)
  {
    binary+=(n%2)*i;
    n/=2;
    i*=10;
  }
  return binary;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
