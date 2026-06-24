/* Program to check the given number is perfect or not
6
factors : 1 2 3 6
          1+2+3+6 = 6(perfect)

28
factors : 1 2 4 7 14 28
          1+2+4+7+14 = 28(perfect)

9
factors : 1 3 9
          1+3 = 4(not perfect)
*/

import java.util.Scanner;
class PerfectNumber
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a Number : ");
 int num = sc.nextInt();
 int sum = 0;
 int i = 1;
 
 while( i <= num/2)
 {
   if(num % i == 0)
     {
       sum = sum + i;
     }
      i++;
 }
   if(sum == num)
      System.out.println(num + " is Perfect");
   else
      System.out.println(num + " is not Perfect");
}
}
 
