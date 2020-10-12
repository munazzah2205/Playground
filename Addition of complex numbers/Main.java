#include<iostream>
using namespace std;
class complex
{
	// Type your code here
  int real,imag;
public:
void set()
{
cin>>real>>imag;
}
friend complex sum(complex,complex);
void display();
};
void complex::display()
{
cout<<real<<"+i"<<imag;
}
complex sum(complex a,complex b)
{
complex t;
t.real=a.real+b.real;
t.imag=a.imag+b.imag;
return t;
};
int main()
{
	// Type your code here
  complex a,b,c;
a.set();
b.set();
c=sum(a,b);
c.display();
	return 0;
}