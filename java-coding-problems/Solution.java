import java.util.*;

class Result{

}
public class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		for(int i=0;i<n+m;i++){
			if(i<n)
			a[i]=sc.nextInt();
			else 
			b[i-n]=sc.nextInt();
		}
		int count=0,value=n;
		boolean flag=true;
		while(value<=m){
			for(int i=0;i<(n>=m?n:m);i++){
				if(value%a[i]!=0)
				flag=false;
			}
		}
	}
}