#include<iostream>
using namespace std;
int main()
{
  int n1,n2,n3,ans;
  cin>>n1;
  cin>>n2;
  cin>>n3;
  cin>>ans;
  int small,gcd;
  if(n1<n2 && n1<n3)
  {
    small=n1;
  } 
  else if(n2<n1 && n2<n3)
  {
	small=n2;
  }
  else{small=n3;}
  while(small>=ans)
  {
	if(n1%small==0 && n2%small==0 && n3%small==0)
    {
      gcd=small;
    }
    small--;
  }
  if(gcd==ans)
  {
    cout<<"Answer is correct.";
  }
  else{cout<<"Answer is wrong.";}
  return 0;
}
  