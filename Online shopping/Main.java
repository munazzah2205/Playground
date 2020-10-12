#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int famt,fdisc,fship,samt,sdisc,sship,aamt=0,adisc=0,aship=0,fprice,sprice,aprice=0;
  cin>>famt;cin>>fdisc;cin>>fship;
  cin>>samt;cin>>sdisc;cin>>sship;
  cin>>aamt;cin>>adisc;cin>>aship;
  fprice=famt-(famt*(fdisc*0.01))+fship;
  cout<<"In Flipkart Rs."<<fprice;
  sprice=samt-(samt*(sdisc*0.01))+sship;
  cout<<"\nIn Snapdeal Rs."<<sprice;
  aprice=aamt-(aamt*(adisc*0.01))+aship;
  cout<<"\nIn Amazon Rs."<<aprice;
  if(fprice<=sprice && fprice<=aprice){
    cout<<"\nHe will prefer Flipkart";}
  else if(sprice<=fprice && sprice<=aprice){
    cout<<"\nHe will prefer Snapdeal";}
  else{cout<<"\nHe will prefer Amazon";}
  return 0;
}