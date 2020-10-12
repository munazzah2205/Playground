#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,n,i,sum=0;
  cin>>n;
  num=n;
  while(num>0)
  {
    i=num%10;
    sum=sum+i;
    num=num/10;
  }
  if(n%sum==0)
  { cout<<"Harshad Number";}
  else{cout<<"Not Harshad Number";}
  return 0;
}