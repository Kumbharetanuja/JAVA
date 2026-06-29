class PalindromeNumber
{
public static void main(String[] args)
{
  int num = 123;
  int temp = num;
  int rev = 0 ;
  
  while(num != 0)
  {
    int digit = num % 10;
    rev = rev * 10 + digit;
    num = num / 10;
  }
  System.out.println(temp == rev ? temp + " is palindrome" : temp + " is not Palindrome");
}
}
/* 
123 != 0
123 % 10 = 3
0 * 10 + 3 = 3
123 / 10 = 12

12 != 0
12 % 10 = 2
3 * 10 + 2 = 32
12 / 10 = 1

1 != 10
1 % 10 = 1
32 * 10 + 1 = 321
1 / 10 = 0

0 != 0 false
*/