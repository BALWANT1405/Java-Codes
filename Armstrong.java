package javacoders;
class Armstrong
{
public static void main(String[] args)
{
int n=371;
int temp,m;
int a=0;
temp=n;
while(n>0)
{
m=n%10;
n=n/10;
a=a+(m*m*m);
}
if(a==temp)
{
System.out.println("NUMBER IS ARMSTRONG");
}
else
{
System.out.println("NUMBER IS NOT A ARMSTRONG");
}
}
}