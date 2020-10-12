#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int spell,broken;
  std::cin>>spell;
  broken=(spell/1000)+(spell%10);
  std::cout<<broken;
  return 0;
}