import java.util.*;

public class Duplicate{
	public static void findDuplicate(int a[]){
		int b[]=new int[10];
		for(int i=0;i<10;i++)
		b[i]=a[i];
		System.out.println("Duplicate values in array:");
		for(int i=0;i<10;i++){
			boolean flag=false;
			for(int j=i+1;j<10;j++){
				if(a[i]==b[j]){
					b[j]=0;
					flag=true;
					break;
				}
			}
			if(flag && a[i]==b[i])
			System.out.printf("%d ",a[i]);
		}
	}
	public static void main(String x[]){
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter values in array:");
		for(int i=0;i<10;i++)
		a[i]=s.nextInt();
		findDuplicate(a);
	}
}