#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,loc,value,arr[20];
  cout<<"Enter the number of elements in the array";
  cin>>n;
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  cout<<"\nEnter the location where you wish to insert an element";
  cin>>loc;
  if(loc>n)
  {
    cout<<"\nInvalid Input";
  }
  else
  {
    cout<<"\nEnter the value to insert"; 
    cin>>value;
    cout<<"\nArray after insertion is";
    for(int i=0;i<loc-1;i++)
    {
      cout<<"\n"<<arr[i];
    }
    cout<<"\n"<<value;
    for(int i=loc-1;i<n;i++)
    {
      cout<<"\n"<<arr[i];
    }
  }
}