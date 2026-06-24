import java.util.Scanner;
class AlphabetVowels1
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);

char ch = sc.next().charAt(0);

switch(ch)
{
case 'A' :
case 'E' :
case 'I' :
case 'O' :
case 'U' :
      System.out.println(" It is a UpperCase Vowels");
      break;
case 'a' :
case 'e' :
case 'i' :
case 'o' :
case 'u' :
      System.out.println(" It is a LowerCase Vowels");
      break;

default : System.out.println("It is not a Vowels");
}
}
}