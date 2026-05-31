class SwappingNumber
{
public static void main(String[] args)
{

int a = 10;
int b = 20;

System.out.println("Before Swapping Number");
System.out.println("A = " + a); //10
System.out.println("B = " + b); //20

//logic for SwappingNumber

int temp = a;
a = b;
b= temp;


System.out.println("After Swapping Number");
System.out.println("A = " + a); //20
System.out.println("B = " + b); //10

}
}

