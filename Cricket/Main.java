#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int tballs,truns,scored,bowled,rem;
  float overs,finished,crr,trr;
  cin>>tballs;
  cin>>truns;
  cin>>scored;
  cin>>bowled;
  overs=tballs/6;
  rem=bowled%6;
  finished=(bowled/6)+(rem*0.1);
  crr=scored/finished;
  trr=truns/overs;
  cout<<overs;
  cout<<"\n"<<finished;
  cout<<"\n"<<fixed<<setprecision(1)<<crr;
  cout<<"\n"<<fixed<<setprecision(1)<<trr;
  if(crr>trr){
	cout<<"\nEligible to Win";}
  else { 
	cout<<"\nNot Eligible to Win";}
  return 0;
}
  