//Program to check the given character is alphabet or not.

class Alphabet
{
public static void main(String[] args)
{
char ch = 'h';

boolean condition = (ch>= 'A' && ch<='Z') || (ch >= 'a' && ch <= 'z');

System.out.println(condition ? ch + " is Alphabet" : ch + " is not Alphabet");

}
}