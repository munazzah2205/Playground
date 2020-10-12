#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,max;
  int arr[10];
  max=arr[0];
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(int i=0;i<n;i++)
  {
    if(arr[i]>max)
    {
      max=arr[i];
    }
  }
  cout<<max;
}