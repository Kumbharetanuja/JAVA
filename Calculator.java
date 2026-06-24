import java.util.Scanner;
class Calculator
{
public static void main(String[] args)
{

  Scanner sc = new Scanner(System.in);
  System.out.println("Calculator + - * / ");
  System.out.println();

  int num1 = sc.nextInt();
  char operator = sc.next().charAt(0);
  int num2 = sc.nextInt();

  switch(operator)
  {
    case '+': System.out.println(" Addition = " + (num1 + num2 ));
              break;

    case '-': System.out.println(" => " + (num1 - num2 ));
              break;

    case '*': System.out.println(" => " + (num1 * num2 ));
              break;

    case '/': {
                if(num1 % num2 == 0)
                  System.out.println(" => " + (num1 / num2 ));
                else
                  System.out.println(" => " + ((double)num1 * num2 ));

               }


  }
}
}