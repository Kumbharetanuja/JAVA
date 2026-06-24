import java.util.Scanner;
class AlphabetVowels2
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);

char ch = sc.next().charAt(0);

switch(ch)
{
case 'A' :case 'E' :case 'I' :case 'O' :case 'U' :
case 'a' :case 'e' :case 'i' :case 'o' :case 'u' :
      System.out.println(" It is a Vowels");
      break;

default : System.out.println("It is not a Vowels");
}
}
}