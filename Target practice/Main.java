#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,turns,count=1,i,sum;
  cin>>n>>turns;
  sum=turns;
  while(sum<n)
  {
    cin>>turns;
    sum=sum+turns;
    count++;
  }
  cout<<"The number of turns is "<<count;
  return 0;
  
    
}