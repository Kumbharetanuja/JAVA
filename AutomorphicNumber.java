import java.util.Scanner;
class AutomorphicNumber
{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number: ");
  int num = sc.nextInt();
  int temp = num;
  int square = num * num;
  int divisor = 1;
  
  while(num != 0)
  { 
    divisor = divisor * 10;
    num = num /10;
  }
  if(square % divisor == temp)
  System.out.println(temp + " is an Automorphic Number");
  else
  System.out.println(temp + " is not an Automorphic Number");
}
}