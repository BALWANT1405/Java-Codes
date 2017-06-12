class Diag_name
{
public static void main(String[] args)
{
String a1="";
String s1="BALWANT";
int ln=s1.length();
System.out.println(ln);
char a=s1.charAt(4);
System.out.println(a);
System.out.println(" ");
System.out.println(s1);
System.out.println(" ");
for(int i=0;i<ln;i++)
{
System.out.println(s1.charAt(i));
}
System.out.println("");
for(int i=0;i<ln;i++)
{
System.out.println(a1+s1.charAt(i));
a1+=" ";
}
}
}