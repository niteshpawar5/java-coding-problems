// This Java program demonstrates constructor overloading and constructor chaining using this().

class A
{
	A(int x,int y)
	{ 
	  this(x);
	  System.out.println(x+" "+y);
	}
	A(int x)
	{
	  System.out.println(x);
	}
}
public class AAPP
{
  public static void main(String x[])
  {
    A a1=new A(5,4);
    
  }
}
