class CountDigit
{
public static void main(String[] args)
{
  int num = 0;
  int count = 0;
  int temp = num;
  do
  {
    count++;
    num = num / 10;
  }
  while(num != 0);
  System.out.println("The number of digit in " + temp+ " is: " + count);
}
}