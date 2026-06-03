class Student
{
//non-static variable
String name;
int sid ;
String course;

public static void main(String[] args)
{
 //object creation 
Student s1 = new Student();
Student s2 = new Student();

//Printing the reference / address

System.out.println(s1);//Student@2f92e0f4
System.out.println(s2);//Student@28a418fc

//Using non-static variable by reference
System.out.println(s1.name); //null
System.out.println(s1.sid); //0
System.out.println(s1.course); //null

//re-intializing the non-static variable using refernce

s1.name = "Tanuja";
s1.sid = 21;
s1.course = "Java Full Stack Development";

//using non-static variable by reference

System.out.println(s1.name); //Tanuja 
System.out.println(s1.sid); //21
System.out.println(s1.course); //Java Full Stack Development
}
}



