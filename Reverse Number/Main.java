#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int n,i;
  cin>>n;
  while(n>0)
  {
 	i=n%10;
    cout<<i;
   	n=n/10;
  }
	return 0;
}