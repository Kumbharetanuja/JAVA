import java.util.Scanner;
class NestedDecisionMaking
{
public static void main(String[] args)
{

   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a Character: ");
   char ch = sc.next().charAt(0);
  
   if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
   {
            if(ch>='A' && ch<='Z')
            {
                 if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
                 {
                      System.out.println(ch + " is UpperCase Vowel");
                 }
                 else
                 {
                      System.out.println(ch + " is UpperCase Consonant");
                 }
             }
             else
             {
                 if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
                 {
                      System.out.println(ch + " is LowerCase Vowel");
                 }
                 else
                 {
                      System.out.println(ch + " is LowerCase Consonant");
                 }
              }
    }
    else if (ch>= '0' && ch<= '9')
    {

         System.out.println(ch + " is Digit");

    }
    else
    {
         System.out.println(ch + " is Special Character");

    }
}
}
    