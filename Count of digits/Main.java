#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,i,count=0;
  cin>>n;
  do
  {
    i=n%10;
    n=n/10;
    count++;
  }while(n>0);
  cout<<count;
  return 0;
}