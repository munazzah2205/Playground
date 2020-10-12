#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,i,m;
  cin>>a;
  cin>>b;
  cin>>c;
  if((a<b && a>c) || (a<c && a>b))
  {
    m=a;
    cout<<"The treasure is in box which has number "<<a<<"\n";
  }
  if((b<a && b>c) || (b>a && b<c))
  {
    m=b;
    cout<<"The treasure is in box which has number "<<b<<"\n";
  }
  if((c>a && c<b) || (c<a && c>b))
  {
    m=c;
    cout<<"The treasure is in box which has number "<<c<<"\n";
  }
  if(m == a)
  {
    i=a;
  }
  else if(m == b)
  {
	i=b;
  }
  else{i=c;}
  for(i;i<=i;i--)
  {
    if(a%i == 0 && b%i == 0 && c%i == 0)
    {
      break;
    }
  }
  cout<<"The code to open the box is "<<i;
  return 0;
  
}