import java.util.*;

public class Reverse{
	public static void arrayReverse(int a[],int start,int mid,int end){
		while(start<=mid){
			int t=a[start];
			a[start]=a[end];
			a[end]=t;
			arrayReverse(a,++start,mid,--end);
		}
		// System.out.println("After reverse:");
		// for(int i=0;i<a.length;i++)
		// System.out.printf("%d ",a[i]);
}
	public static void main(String x[]){
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter value in array:");
		for(int i=0;i<a.length;i++)
		a[i]=s.nextInt();
		arrayReverse(a,0,(a.length)/2,a.length-1);
		System.out.println("After reverse:");
		for(int i=0;i<a.length;i++)
		System.out.printf("%d ",a[i]);
	}
}