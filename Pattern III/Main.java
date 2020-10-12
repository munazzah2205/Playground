#include<iostream>
using namespace std;
int main()
{
  int n,j;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(j<i)
      {
        cout<<i<<"*";
      }
      else
      {
        cout<<i<<"\n";
      }
    }
  }
  for(int i=n;i>=0;i--)
  {
    for(j=1;j<=i;j++)
    {
      if(j<i)
      {
        cout<<i<<"*";
      }
      else
      {
        cout<<i<<"\n";
      }
    }
  }
}
  