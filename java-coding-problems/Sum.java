import java.util.*;

public class Sum{
	public static int getSum(int a[],int count){
		int sum=0;
		while(count>0){
			sum+=a[count-1];
			getSum(a,--count);
		}
		return sum;
	}
	public static void main(String x[]){
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		int count=a.length;
		System.out.println("Enter array elements:");
		for(int i=0;i<count;i++)
		a[i]=s.nextInt();
		int result=getSum(a,count);
		System.out.println("Sum is "+result);
	}
}