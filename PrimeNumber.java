/* Program to check the given number is prime or not.
1 = not a prime number
2 = prime number
5 = prime number
9 = not a prime number
 
Note:- Prime number should have exactly 2 factors (perfect divisors)
*/

import java.util.Scanner;
class PrimeNumber
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number : ");
int num = sc.nextInt();
int count = 0;
int i=1;

while(i <= num)
{
 if(num % i == 0)
  { 
    count++;
  }
  i++;
}
  if(count == 2)
     System.out.println(num + " is a prime");
  else
     System.out.println(num + " is not a Prime");
}
}