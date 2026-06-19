class TypeCasting 
{
public static void main(String[] args)
{

//byte to int
byte b = 127; // I have type 128 so it's give the error of possible lossy conversion from int to byte.
int i = (int)b ; //explicit typecasting.
System.out.println(i); //127

//int to double
int a = 54;
double d = a; // implicite typecasting
System.out.println(d); //54.0

//char to int
char ch = 'A';
int c = ch;
System.out.println(c); //65
 
//byte to short
byte e = 24;
short s = e ;
System.out.println(s); //24

//byte to double
byte f = -128; //  -129 give these error incompatible types: possible lossy conversion from int to byte
double g = f;
System.out.println(g); //-128


}
}