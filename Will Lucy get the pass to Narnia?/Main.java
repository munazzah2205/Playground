#include<iostream>
using namespace std;
int main()
{
  int n1,n2,result,op;
  std::cout<<"Enter first number : Enter second number : Menu";
  std::cin>>n1;
  cin>>n2;
  cout<<"\n1.Addition";
  cout<<"\n2.Subtraction";
  cout<<"\n3.Multiplication";
  cout<<"\n4.Division";
  cout<<"\n5.Remainder";
  cin>>op;
  switch(op)
  {
    case 1:result=n1+n2;
      		cout<<"\n"<<result;
      		 break;
    case 2:result=n1-n2;
      		cout<<"\n"<<result;
      		 break;
    case 3:result=n1*n2;
      		cout<<"\n"<<result;
      		 break;
    case 4:result=n1/n2;
      		 cout<<"\n"<<result;     		
			break;
    case 5:result=n1%n2;
      		cout<<"\n"<<result;
      		 break;
    default:cout<<"\nInvalid operation";
      		break;
  }
  
}
      
  