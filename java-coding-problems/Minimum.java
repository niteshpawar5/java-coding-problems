import java.util.*;

public class Minimum{
	public static int getMin(int a[]){
		int min=a[0];
		for(int i=0;i<5;i++){
			if(a[i]<min)
			min=a[i];
		}
		return min;
	}
	public static void main(String x[]){
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter elements in array:");
		for(int i=0;i<5;i++)
		a[i]=s.nextInt();
		int result=getMin(a);
		System.out.printf("Minimum value: %d",result);
	}
}