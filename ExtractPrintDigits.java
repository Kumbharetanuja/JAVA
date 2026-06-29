class ExtractPrintDigits
{
public static void main(String[] args)
{
  int num = 1542;     
  while(num != 0 )
  {
    int digit = num % 10;
    System.out.println(digit); //2 4 5 1
    num = num / 10;
   }
}
}

/* 
1542 != 0
1542%10 = 2
digit = 2
1542/10 = 154 

154 != 0
154%10 = 4
digit = 4
154/10 = 15

15 != 0
15%10 = 5
digit = 5
15/10 = 1

1 != 0
1%10 = 1
digit = 1
1/10 = 0

0 != 0 stop

*/