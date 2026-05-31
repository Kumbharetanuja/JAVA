class SwappingNumberWithoutTemp
{
public static void main(String[] args)
{
int a=10;
int b=20;

System.out.println("After Swapping");
System.out.println("A = " + a); //10
System.out.println("B = " + b); //20
 

a=a+b; //30 = 10 + 20
b=a-b; //10 = 30 - 20
a=a-b; //20 = 30 - 10

System.out.println("Before Swapping");
System.out.println("A = " + a); // 20
System.out.println("B = " + b); // 10

}
}