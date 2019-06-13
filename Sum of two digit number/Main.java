#include<stdio.h>
int main()
{
  int number,sum;
  scanf("%d",&number);
  while(number!=0)
  {
  sum=sum+number%10;
  number=number/10;
  }
  //Type your code here
  printf("%d",sum);
  return 0;
}