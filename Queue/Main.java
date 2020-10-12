#include<iostream>
using namespace std;
int q(int n,int m,int arr[])
{
  int sum=0;
   for(int i=0;i<n;i++)
  {
	sum=sum+arr[i];
  }
  if(n==1 && m==2)
  {
    return 1;
  }
  else{return (sum/m)+1;}
}
int main()
{
  //Type your code here.
  int n,m,arr[10],sum=0;
  cin>>n>>m;
  for(int i=0;i<n;i++)
  {
	cin>>arr[i];
  }
  cout<<q(n,m,arr);
}