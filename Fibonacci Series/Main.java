#include<iostream>
using namespace std;
int fib(int n)
{
  int first,second;
  if(n==0){return n;}
  else if(n==1){return n;}
  else{ return fib(n-1)+fib(n-2);}
}
int main()
{
  //Type your code here.
  int n,ans;
  cin>>n;
  ans=fib(n-1);
  cout<<"The term "<<n<<" in the fibonacci series is "<<ans;
}