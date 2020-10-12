#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,arr[10],odd=0,even=0;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(int i=0;i<n;i++)
  {
    if(arr[i]%2==0)
    {
      even++;
    }
    if(arr[i]%2!=0)
    {
      odd++;
    }
  }
  if(odd==n){cout<<"\nThe array is Odd";}
  else if(even==n){cout<<"\nThe array is Even";}
  else{cout<<"\nThe array is Mixed";}
  
}