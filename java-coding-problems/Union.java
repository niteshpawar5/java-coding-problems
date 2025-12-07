import java.util.*;

public class Union{
	public static void arrayUnion(int a[],int b[]){
		int c[]=new int[10];
		for(int i=0;i<5;i++)
		c[i]=a[i];
		for(int i=5;i<10;i++)
		c[i]=b[i-5];
		System.out.println("After combining both arrays:");
		for(int i=0;i<10;i++)
		System.out.printf("%d ",c[i]);
	}
	public static void main(String x[]){
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("Enter elements of first array:");
		for(int i=0;i<5;i++)
		a[i]=s.nextInt();
		System.out.println("Enter elements of second array:");
		for(int i=0;i<5;i++)
		b[i]=s.nextInt();
		arrayUnion(a,b);
	}
}