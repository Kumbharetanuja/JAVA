import java.util.Scanner;
class DoWhile
{
public static void main(String[] args)
{
  Scanner sc =  new Scanner(System.in);
  int pin;
  do
  {
    System.out.println("Enter Pin: ");
    pin = sc.nextInt();
    if(pin != 1234)
      System.out.println("Wrong Pin !!,Try Again");
  }
  while(pin != 1234);
  System.out.println("Unlocked !!!!");
}
}
