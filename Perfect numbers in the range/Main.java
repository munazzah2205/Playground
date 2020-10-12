#include <iostream>
using namespace std;
int main()
{
    int i, j, end, sum,upper;
  	cin>>upper;
	cin>>end;
    for(i=upper; i<=end; i++)
    {
        sum = 0;
        for(j=1; j<i; j++)
        {
            if(i % j == 0)
            {
                sum += j;
            }
        }
 
        /* If the current number i is Perfect number */
        if(sum == i)
        {
           cout<<i<<" " ;
        }
    }

    return 0;
}