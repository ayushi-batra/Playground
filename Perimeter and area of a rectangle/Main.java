#include<stdio.h>
int main()
{
  //Type your code here
  int length = 6, breadth = 9, perimeter, area;
  perimeter = 2*length+ 2*breadth;
  area = length*breadth;
  printf("The perimeter of the rectangle is: %d cm\n", perimeter);
  printf("The area of the rectangle is: %d sq cm", area);
  return 0;
}