#include <stdio.h>
float fahrenheit(float celsius);
float kelvin(float celsius);
int main()
{
    float celsius;
    scanf("%f",&celsius);
    printf("temperature in Fahrenheit %f", fahrenheit(celsius));
    printf("\ntemperature in Kelvin %f", kelvin(celsius));
    return 0;
}
float fahrenheit(float celsius)
{
	//type your code here
  float f =(float) ((celsius*1.8)+32);
  return f;
}
float kelvin(float celsius)
{
	//type your code here
  return celsius+273.15;
}
