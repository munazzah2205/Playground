#include<iostream>
using namespace std;
int dec_to_oct(int n)
{
    //Your code goes here
  int octal,i=1;
  while(n!=0)
  {
    octal+=(n%8)*i;
    n/=8;
    i*=10;
  }
  return octal;
}
int main()
{
    int n;
    cin>>n;
    cout<<dec_to_oct(n);
}
