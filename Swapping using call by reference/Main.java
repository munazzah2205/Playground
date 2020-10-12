#include<iostream>
using namespace std;
int swap(int &a,int &b)
{
  int temp;
  temp=a;
  a=b;
  b=temp;
}
int main()
{
  int x,y;
  cin>>x;
  cin>>y;
  cout<<"Before swapping a= "<<x<<" and b="<<y;
  swap(x,y);
  cout<<"\n"<<"After swapping a= "<<x<<" and b="<<y;
  return 0;
}