import java.util.Scanner;
public class arr_class
{
public static void main(String[] args)
{
int item[]=new item[30];
int c,t=0,y;
Scanner sc=new Scanner(System.in);
public void show()
{
System.out.println("ENTER NAME OF CUSTOMER:");
cn=sc.next();
System.out.println("ENTER TOTAL ITEMS:");
c=sc.nextInt();
System.out.println("ENTER TOTAL PRICE:");
t=sc.nextInt();
for(y=1;y<=c;y++)
{
item[y]=sc.nextInt();
}
public void display()

{
System.out.println("NAME"+cn);
System.out.println("TOTAL ITEM"+c);
for(y=0;y<=c;y++)
{
t=t+item[y];
}
System.out.println("TOTAL BILL"+t);


}


}

}
}
