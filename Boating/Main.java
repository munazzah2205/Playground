#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int total,adults,child;
  cin>>total;
  cin>>adults;
  cin>>child;
  if(total>=((adults*75)+(child*30)))
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
  return 0;
}