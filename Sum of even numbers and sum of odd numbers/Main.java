#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,arr[15],sum1=0,sum2=0;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(int i=0;i<n;i++)
  {
    if(arr[i]%2==0)
    {
      sum1=sum1+arr[i];
    }
    if(arr[i]%2!=0)
    {
      sum2=sum2+arr[i];
    }
  }
  cout<<"The sum of the even numbers in the array is "<<sum1;
  cout<<"\nThe sum of the odd numbers in the array is "<<sum2;
}