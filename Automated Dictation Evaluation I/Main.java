#include<iostream>
#include<string.h>
#include<stdio.h>
using namespace std;
int main()
{
  //Type your code here.
  char str1[20],str2[20];
  gets(str1);
  gets(str2);
  if(strcmp(str1,str2)==0)
  {
    cout<<"It is correct";
  }
  else{cout<<"It is wrong";}
  
  
}