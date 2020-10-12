#include<iostream>
using namespace std;
int main()
{
  int age;
  float time,t1=10.15,t3=18.00,t4=22.0;
  cin>>age;
  cin>>time;
  if(age>13)
  {
    if(time==t1 || time==t3 || time==t4)
    {
      cout<<"$8.00";
    }
    else{cout<<"$5.00";}
  }
  else
  {
    if(time==t1 || time==t3 || time==t4)
    {
      cout<<"$4.00";
    }
    else{cout<<"$2.00";}
  }
}
    