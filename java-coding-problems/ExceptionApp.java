import java.util.*;
public class ExceptionApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{1,2,3,4,5};
		try{
			System.out.println("Array Elements are:");
			for (int i=0;i<=5;i++){
				System.out.printf("a[%d]=%d\n",i,a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException xy){
			System.out.println("Error is "+xy);
		}
	}
}