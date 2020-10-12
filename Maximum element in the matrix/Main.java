#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,max=0;
  cin>>r;
  cin>>c;
  int mat[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
		cin>>mat[i][j];
    }
  }
  max=mat[0][0];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
		if(max<=mat[i][j])
        {
          max=mat[i][j];
        }
    }
  }
  cout<<"The maximum element is "<<max<<"\n";
  
}