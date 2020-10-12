#include<iostream>
#include<string>
#include<math.h>
using namespace std;
int main() 
{ 
	std::string fnum;
	//Type your code here
  int x=-1;
  std::getline (std::cin,fnum);
  x= fnum.find(".");
  if(x!=-1)
  {
     std::cout<<"Floating part is : ";
    for(int i=x+1;i<fnum.length();i++){
      std::cout<<fnum.at(i);}
  }
  else{std::cout<<"Floating part is : ";}
 }