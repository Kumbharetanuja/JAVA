class ExtractAddDigits
{
public static void main(String[] args)
{
  int num = 134;
  int temp = num;
  int sum = 0;
  
  while(num != 0)
  {
    int digit = num % 10;
    sum = sum + digit; //8 
    num = num /10;
  }
  System.out.println("The sum of digit in " +temp+ " is : " + sum); //The sum of digit in 134 is : 8
}
}
/*
134 != 0
134 % 10 = 4
0 + 4 = 4
134 / 10 = 13

13 != 0
13 % 10 = 3
4 + 3 = 7
13 / 10 = 1

1 != 0
1 % 10 = 1
7 + 1 = 8
1 / 10 = 0

0 != 0  end (false)
*/