import java.util.*;

public class MinDistance{
	public static void main(String x[]){
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		int n1,n2,diff=10,result=0;
		System.out.println("Enter array elements:");
		for(int i=0;i<a.length;i++)
		a[i]=s.nextInt();
		System.out.println("Enter elements to find minimum distance:");
		n1=s.nextInt();
		n2=s.nextInt();
		for(int i=0;i<a.length;i++){
			if(a[i]==n1){
				for(int j=i+1;j<a.length;j++){
					if(a[j]==n2){
						if(i<j)
						result=j-i;
						else
						result=i-j;
						break;
					}
				}
			}
			if(a[i]==n2){
				for(int j=i+1;j<a.length;j++){
					if(a[j]==n1){
						if(i<j)
						result=j-i;
						else
						result=i-j;
						break;
					}
				}
			}
			if(result<diff)
			diff=result;
		}
		System.out.println("Minimum difference is: "+diff);
	}
}