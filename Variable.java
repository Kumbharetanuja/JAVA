class Variable
{
public static void main(String[] args)
{
 //variable declaration
int a,c;

//variable intitialization
a=10;
c=30;

//declaration and Initialization
int b=10,d=20;

b=20; //re-intialization 

//variable utilization
System.out.println(a); //10
System.out.println(a+b); //30

int e = a;

//utilizing the sum of all the variable

int sum = a + b + c + d + e;
System.out.println(sum);

//updating a variable 
int age =18;
age = age + 1; //18 + 1 = 19
age = age - 1; // 19 - 1 = 18

System.out.println(age); //18

}
}