#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,arr[5][5],sum=0;
  int row[r];
  cin>>r;
  cin>>c;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>arr[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      sum+=arr[i][j];
    }
    cout<<sum<<"\n";
    sum=0;
  }
  
}