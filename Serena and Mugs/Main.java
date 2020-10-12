#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s,sum=0;
  int arr[5];
  cin>>n;
  cin>>s;
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(int i=0;i<n;i++)
  {
    sum=sum+arr[i];
  }
  if(sum<=s)
  {
    cout<<"YES";
  }
  else{cout<<"NO";}
  
  
}