#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int amt,rate,years;
  float interest,amount,disc,damt;
  std::cin>>amt;
  std::cin>>rate;
  std::cin>>years;
  interest=(amt*rate*years)/100;
  amount=amt+interest;
  disc=(interest*2)/100;
  damt=amount-disc;
  std::cout<<interest<<"\n"<<amount<<"\n"<<disc<<"\n"<<damt;
  return 0;
  
}