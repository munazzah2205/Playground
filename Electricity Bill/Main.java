#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int units,total;
  cin>>units;
  if(units<=200)
  {
    total=0.5*units;
  	cout<<"Rs."<<total;
  }
  else if(units<=400)
  {
    total=0.65*units+100;
  	cout<<"Rs."<<total;
  }
  else if(units<=600)
  {
    total=0.80*units+200;
  	cout<<"Rs."<<total;
  }
  else 
  {
    total=1.25*units+425;
  	cout<<"Rs."<<total;
  }
  return 0;
}