#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n,i,j,flag=0,s=0,l,m,k;
  cin>>n;
  l=n+1;
  m=n;
  for(int i=1;i<=n;i++)
  {
    for(int j=2;j<l;j++)
    {
       if(i%2!=0)
       {
         cout<<i;
         k=i;
         flag=1;
         s=j;
         if(s==m)
         {
           cout<<++k;
         }
       }
      if(i%2==0)
      {
        cout<<i;
        flag=0;
      }
    }
    cout<<endl;
    if(i<n)
    {
      if(flag==1)
      {
        cout<<++k;
      }
    }
  }
   return 0;
}