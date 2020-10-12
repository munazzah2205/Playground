#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n1=0,n2=1,n3,n;
  cin>>n;
  if(n==0 || n==1)
  {cout<<n;}
  else{n3=n1+n2;}
  for(int i=3;i<=n;i++)
  {
    n1=n2;
    n2=n3;
    n3=n1+n2;
  }
  cout<<n2;
  for(int j=1;j<=n;j++)
  {
    //cout<<j<<" ";
  }
  
  return 0;
  
}