#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int f,rem,temp,a=0,sum=0;
  temp=n;
  while(temp!=0)
  {
    temp=temp/10;
    a++;
  }
  f=n;
  while(f!=0)
  {
    rem=f%10;
    sum=sum+power(rem,a);
    f=f/10;
  }
  if(sum==n)
  {return 1;}
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}