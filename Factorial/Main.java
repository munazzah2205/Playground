#include<iostream>
using namespace std;
int fact(int n)
{
  if(n==1){return 1;}
  else if(n==0){return 1;}
  else{return n*fact(n-1);}
}
int main()
{
  //Type your code here.
  int n,ans;
  cin>>n;
  ans=fact(n);
  cout<<"The factorial of "<<n<<" is "<<ans;
  return 0;
}