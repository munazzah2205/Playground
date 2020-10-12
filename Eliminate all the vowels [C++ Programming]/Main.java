#include<iostream>
#include<stdlib.h>
#include<string.h>
using namespace std;

void consonants(char *str)
{
    //Type your code here 
   int len=strlen(str);
  for(int i=0;i<len;i++)
  {
    if(str[i]=='A' || str[i] == 'a' || str[i] == 'E' || str[i] == 'e' || str[i] == 'I'|| str[i] == 'i'|| str[i] == 'O' || str[i] == 'o' || str[i] == 'U' || str[i] == 'u')
     continue;
    else{printf("%c",str[i]);}
  }
}

int main()
{
    char str[100];
    scanf("%s",str);
    consonants(str);
    return 0;
}


