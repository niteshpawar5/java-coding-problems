import java.util.*;
abstract class Calc 
{	
	int no,first,second;
	void setValue(int no)
	{
		this.no=no;
	}
	void setValue(int first,int second)
	{
		this.first=first;
		this.second=second;
	}
	abstract void getResult();
}
class Square
{
	void getResult()
	{
		System.out.println("Square: "+(no*no));
	}
}
class Cube
{
	void getResult()
	{
		System.out.println("Cube: "+(no*no*no));
	}
}
class Factorial
{
	void getResult()
	{
		int fact=1;
		for(int i=1;i<=no;i++)
		fact=fact*i;
		System.out.println("Factorial: "+fact);
	}
}
class Power
{
	void getResult()
	{
		int pow=1;
		while(second!=0)
		{
			pow=pow*first;
			second--;
		}
		System.out.println("Power: "+pow);
	}
}
public class CalcAapp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int no,first,second;
		System.out.println("Enter number:");
		no=sc.nextInt();
		Calc c=new Square();
		c.setValue(no);
		c.getResult();
		c=new Cube();
		c.setValue(no);
		c.getResult();
		c=new Factorial();
		c.setValue(no);
		c.getResult();
		System.out.println("Enter index and power");
		first=sc.nextInt();
		second=sc.nextInt();
		c=new Power();
		c.setValue(first,second);
		c.getResult();
	}
}