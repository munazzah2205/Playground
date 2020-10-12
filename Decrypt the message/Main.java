#include<iostream>
using namespace std;
int main()
{
  int n,nt,sum=0,i=1;
  cin>>n;
  cin>>nt;
  int temp=n+nt;
  while(i<temp)
  {
	if((temp%i)==0)
    {
      sum=sum+i;
    }
    i++;
  }
  if(temp==sum)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
  return 0;
}