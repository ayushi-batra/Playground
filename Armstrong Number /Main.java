#include <stdio.h>
int main() {
	int i, n=0, number, lastDigit, remainder, result=0, temp;
    scanf("%d",&number);
    temp=number;
  
  while(temp!=0)
  {
    temp/=10;
    ++n;
  }
  temp=number;
  
  while(temp!=0)
  {
    remainder=temp%10;
    result+=pow(remainder,n);
    temp/=10;
  }
  
  if(result==number)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
  return 0;
}