class ReversingNumber1
{
public static void main(String[] args)
{
  int num = 123;
  int temp = num;
  int rev = 0;
  
  while(num != 0)
  {
    int digit = num % 10;
    rev = rev * 10 + digit;
    num = num / 10;
  }
  System.out.println("The Reverse of " + temp + " is : " + rev);
}
}
/* 
123 != 0
123 % 10 = 3
digit = 3 
0 * 10 + 3 = (rev = 3)
123/10 = 12

12 != 0
12 % 10 = 2
digit = 2
3 * 10 + 2 = (rev = 32)
12 / 10 = 1

1 != 0
1 % 10 = 1
digit = 1
32*10 + 1= (rev = 321)
1 / 10 = 0 

0 != 0 false
*/