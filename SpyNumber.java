class SpyNumber
{
public static void main(String[] args)
{
  int num = 123;
  int temp = num;
  int sum = 0;
  int product = 1;

  while (num != 0)
  {
    int digit = num % 10;
    sum = sum + digit;
    product = product * digit;
    num = num / 10;
   }
   System.out.println(sum == product ? temp + " is Spy Number" : temp + " is not a Spy Number");
}
}

/*  
123 != 0
123 % 10 = 3
digit = 3
0 + 3 = 3
1 * 3 = 3
123 / 10 = 12 

12 != 0
12 % 10 = 2
digit = 2
3 + 2 = 5
3 * 3 = 6
12 / 10 = 1

1 != 0
1 % 10 = 1
digit = 1
5 + 1 = 6
6 * 1 = 6
1 / 10 = 0

0 != 0 false
*/