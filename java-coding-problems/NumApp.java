import java.util.*;
abstract class Num
{	int x;
	void setValue(int x)
	{
		this.x=x;
	}
	abstract int getResult();
}
class Factorial extends Num
{
	int getResult()
	{
		int fact=1,m=x;
		while(m!=0)
		{
		  fact=fact*m;
		  m--;
		}
	}
}
Class Reverse extends Num
{
	int getResult()
	{
	}
}
public class NumApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.print("Enter number:");
		no=sc.nextInt();
		Factorial f=new Factorial();
		f.setValue(no);
		System.out.println("Factorial of "+no+" is "+f.getResult());
		Reverse r=new Reverse();
		r.setValue(no);
		System.out.println("Reverse of "+no+" is "+r.getResult());
	}
}
