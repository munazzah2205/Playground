#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int row,col,tno,col2,col3,col4,col5,row2;
  cin>>row;
  cin>>col;
  cin>>tno;
  col2=2*col;
  col3=3*col;
  col4=4*col;
  col5=5*col;
  row2=2*row;
  if(tno>1 && tno<=col){
	cout<<"Yes";}
  else if(tno==col || tno==col2 || tno==col3 || tno==col4 || tno==col5){
	cout<<"Yes";}
  else if(tno==(col+1) || tno==(col2+1) || tno==(col3+1) || tno==(col4+1) || tno==(col5+1)){
	cout<<"Yes";}
  else{ cout<<"No";}
  return 0;
}