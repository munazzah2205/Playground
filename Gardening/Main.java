#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int rows,col,tno,result;
  cin>>rows;
  cin>>col;
  cin>>tno;
  if(rows+col==tno || (rows+col)*2==tno){
    cout<<"It is a mango tree";}
  else{
    cout<<"It is not a mango tree";}
  return 0;
}
