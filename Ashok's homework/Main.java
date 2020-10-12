#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int arr1[10][10],arr2[10][10],result[10][10];
  int r,c,i,j;
  cin>>r;
  cin>>c;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>arr1[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>arr2[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      result[i][j]=arr1[i][j]+arr2[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cout<<result[i][j]<<" ";
    }
    cout<<"\n";
  }
}