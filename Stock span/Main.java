#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,arr[20],x=1,y=0;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  cout<<x;
  for(int i=1;i<n;i++)
  {
    if(arr[i]<arr[i-1])
    {
      cout<<"\n"<<x;
    }
    else
    {
      y=y+2;
      cout<<"\n"<<y;
    }
  }
}