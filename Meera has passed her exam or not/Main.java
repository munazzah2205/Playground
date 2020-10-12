#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,arr[10],value,flag;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  cin>>value;
  for(int i=0;i<n;i++)
  {
    if(value==arr[i])
    {
      flag=1;
      break;
    }
    else{flag=0;}
  }
  if(flag==1){cout<<"She passed her exam";}
  else{cout<<"She failed";}
}