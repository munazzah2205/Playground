#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mileage;
  int petrol,remdist;
  cin>>mileage;
  cin>>petrol;
  cin>>remdist;
  if((mileage*petrol>=remdist)){cout<<"Can reach";}
  else{cout<<"Cannot reach";}
  return 0;
}