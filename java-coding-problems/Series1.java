import java.util.*;

public class Series1{
	public static void main(String x[]){
		Scanner s=new Scanner(System.in);
		int n,a=0,b=0;
		System.out.println("Enter range of series:");
		n=s.nextInt();
		for(int i=1;i<=n;i++){
			if(i%2!=0 ){
				System.out.printf("%d ",a);
				a+=2;
			}
			else
			System.out.printf("%d ",b++);
		}
	}
}