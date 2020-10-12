#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,xh=3,yh=4;
  std::cin>>x;
  std::cin>>y;
  std::cout<<std::max(x-xh,y-yh);
  return 0;
 }