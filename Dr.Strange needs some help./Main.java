#include<iostream>
#include<math.h>
using namespace std;
int func(int m,int n)
{
  int h;
  h=pow(m,n);
  return h;
}
int main()
{
  int m,n,req;
  cin>>m;
  cin>>n;
  cin>>req;
  if(func(m,n)>=req)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else{cout<<"Sorry Doctor! You need more bacteria.";}
  return 0;
}
    