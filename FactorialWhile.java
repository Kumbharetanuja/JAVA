/* Program to find the factorial of a number 
0! = 1
1! = 1
2! = 2*1 = 2
5! = 5*4*3*2*1 = 120
*/

class FactorialWhile
{
public static void main(String[] args)
{
int n = 6;
int fact = 1;
int i=1;
while(i <= n)
{
fact = fact * i;
i++;
}
System.out.println("Factorial of " +n+ " is : " + fact);
}
}