#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,arr1[5][5],arr2[5][5],result[5][5];
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