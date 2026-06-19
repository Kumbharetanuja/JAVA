//WAP to demonstrate below example ,where all the condition need  to be Satisfied.

class Tshirt
{
public static void main(String[] args)
{
String color = "Black";
char size = 'L';
double price = 280;

boolean condition = color.equals("Black") && price <= 500.0 && size == 'L';

System.out.println("Result :" + condition);

}
}