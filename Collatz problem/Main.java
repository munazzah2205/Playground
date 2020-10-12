#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count=0,num;
  cin>>n;
  num=n;
  cout<<n;
  while(num!=1)
  {
  	if(num%2==0)
    {
      num=num/2;
    }
    else
    {
      num=3*num+1;
    }
    count++;
    cout<<"\n"<<num;
  }
  cout<<"\n"<<count;
  return 0; 
}