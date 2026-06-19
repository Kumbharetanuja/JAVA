import java.util.Scanner;
class SwitchCase
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 System.out.println("======Welcome to QHotel======");
 System.out.println();
 System.out.println("Food Menu");
 System.out.println("1. Dosa");
 System.out.println("2. Idli");
 System.out.println("3. Sambhar");
 System.out.println("4. Chutney");
 System.out.println();
 System.out.print("Choose an Option: ");

 int choise = sc.nextInt();
 
 switch(choise)
 {
   case 1 : System.out.println("Dosa is Selected and Ordered");
            break;

   case 2 : System.out.println("Idli is Selected and Ordered");
            break;

   case 3 : System.out.println("Sambhar is Selected and Ordered");
            break;

   case 4 : System.out.println("Chutney is Selected and Ordered");
            break;

   default: System.out.println("Invalid Choise !!!!!");
}
}
}
