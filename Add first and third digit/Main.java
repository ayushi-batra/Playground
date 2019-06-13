#include<stdio.h>
int main()
{
  int number, new_number,n1,n2;
  //Type your code here
  scanf("%d",&number);
  n1=number%10;
  n2=number/100;
  new_number=n1+n2;
  printf("%d",new_number);
  return 0;
}