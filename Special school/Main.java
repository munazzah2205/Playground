#include<iostream>
#include<string.h>
#include<stdio.h>
using namespace std;
void strrrev(char * str)  
{
  int j = 0, i = 0;
  while(str[j+1]) j++;
  while(i < j){
    char temp = str[i];
    str[i] = str[j];
    str[j] = temp;
    i++;
    j--;
  }
}
int main()
{
  //Type your code here.
  char str1[20],str2[20],rev[20];
  gets(str1);
  gets(str2);
  strrrev(str1);
  if(strcmp(str2,str1)==0)
  {
    cout<<"It is correct";
  }
  else{cout<<"It is wrong";}
  
}