class IncrementDecrement{
public static void main(String args[])
{
int num1 = 2456;
int num2 = 7896;

int result = num1 % 10 + num2 % 100 - 2  * (num1 / 10 + num2 / 100);

System.out.println("Result = " + result);

}
}
