#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,arr[5][5],diag1=0,diag2=0;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>arr[i][j];
    }
  }
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(i==j)
      {
        diag1=diag1+arr[i][j];
      }
      if(i+j+1 == n)
      {
        diag2=diag2+arr[i][j];
      }
    }
  }
  if(diag1==diag2)
  {
    cout<<"Yes";
  }
  else{cout<<"No";}
 
  
}