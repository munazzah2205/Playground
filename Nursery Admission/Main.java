#include<iostream>
#include<string.h>
#include<stdio.h>
using namespace std;
int main()
{
  //Type your code here.
  char str[20];
  int len;
  gets(str);
  len = strlen(str);
  cout << "The number of letters in the name is " << len;
}