#include<bits/stdc++.h>
using namespace std;

int main()
{  
int n, i;
  unsigned long long fact=1;
cin>>n;
for(i =1; i <= n; i++)
{
     fact = fact * i;
}
cout<<fact;  
return 0;
}
