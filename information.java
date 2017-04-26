import java.util.Scanner;

class library
{
public void info()
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("THE INFORMATION ARE GIVEN BELOW ARE:\n");
System.out.println("ENTER YOUR CHOICE EITHER   1   OR   2  \n");
a=sc.nextInt();
student s=new student();
teacher t =new teacher();
if(a==1)
{
s.info1();
}
else
{
t.info2();
}
}

}

class student
{
public void info1()
{
System.out.println("THE STUDENT INFORMATION OF STUDENT ARE:\n");
System.out.println("NAME \t\t 		 BOOK_NAME       \t\t   ISSUED DATE\n");
System.out.println("MANPREET	 \t 	 CORE JAVA	  \t\t  12/08/2016 \n");
System.out.println("BALWANT  \t\t  	 ADVANCED JAVA     \t\t  11/05/2016 \n");
System.out.println("DIVYA    \t\t 	 ANDROID 	  \t\t  21/08/0216 \n");
}
}

class teacher
{

public void info2()
{

System.out.println("NAME  \t\t         BOOK_NAME              \t ISSUED DATE\n");
System.out.println("MUKESH \t\t         INTERNT PROGRAM    \t\t 21/09/2016 \n");
System.out.println("RAMESH  \t        DATA STRUCTURE        \t\t 18/02/2016\n");
System.out.println("MANMEET \t \t   ADA ALGORITHMS       \t 5/01/0216 \n");

}
}

public class information
{
public static void main(String[] args)
{
library l=new library();
l.info();
}
}