#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int *a;
  int n,i,male=0,female=0;
  cin>>n;
  a=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>*(a+i);
  }
 for(int i=0;i<n;i++)
  {
    if(*(a+i)%2==0)
    {
      female++;
    }
   else{male++;}
  }
  cout<<male;
  cout<<"\n"<<female;
  return 0;
}