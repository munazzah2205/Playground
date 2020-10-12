#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int item;
  float time,t;
  cin>>item;
  cin>>time;
  switch(item)
  {
    case 1:cout<<time;
      break;
    case 2:t=time+(time*0.5);
      cout<<setprecision(2)<<fixed<<t;
      break;
    case 3:t=2.0*time;
      cout<<setprecision(2)<<fixed<<t;
      break;
    default:cout<<"Number of items is more";
      break;
  }
  return 0;
}