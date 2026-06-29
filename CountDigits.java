class CountDigits
{
public static void main(String[] args)
{
  int count = 0;
  int num = 1324  ;
  int temp = num;
  while(num != 0)
  {
    count++; // 1 
    num = num / 10;
  }
  System.out.println("The number of digit in " +temp+ " is : " + count );
}
}
/*
1324 != 0
1324 / 10 = 132

132 != 0
132 / 10 = 13

13 != 0
13 / 10 = 1

1 != 0
1 / 10 = 0

0 != 0

*/ 