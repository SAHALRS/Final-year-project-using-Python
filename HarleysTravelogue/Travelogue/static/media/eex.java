public class eex
{
public void fun()
{
try
{
int data=5/0;
}
catch(ArithmeticException e)
{
System.out.println("error");
}
}
public static void main(String [] args)
{
 eex obj=new eex();
 obj.fun();
}
}
