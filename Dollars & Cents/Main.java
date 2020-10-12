#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d,d1,c1,d2,c2;
  cin>>d1;
  cin>>c1;
  cin>>d2;
  cin>>c2;
  int c=c1+c2;
  if(c<100)
  {
    d=d1+d2;
    cout<<d;
    cout<<"\n"<<c;
  }
  else
  {
    d=d1+d2+1;
    cout<<d;
    c=c1+c2-100;
    cout<<"\n"<<c;
  }
  return 0;
}