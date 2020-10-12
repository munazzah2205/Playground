#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int birth,current;
  cin>>birth;
  cin>>current;
  if(birth>current)
  {
    int x=1900+birth;
    int y=2000+current;
    cout<<y-x;
  }
  else
  {
    int a=2000+birth;
    int b=2000+current;
    cout<<b-a;
  }
  return 0;
}