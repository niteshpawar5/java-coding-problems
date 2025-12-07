import java.util.*;

class Armstrong{
	int n;
	void set(int n){
		this.n=n;
	}
	boolean checkArmstrong(){
		int l,m,count=0;
		boolean check=false;
		m=l=n;
		while(l!=0){
			count++;
			l/=10;
		}
		int arm=0;
		while(m!=0){
			int value=1;
			int rem=m%10;
			for(int i=1;i<=count;i++){
				value*=rem;
			}
			arm+=value;
			m/=10;
		}
		if(n==arm)
		check=true;
		return check;	
	}
}
public class ArmstrongNumber{
	public static void main(String x[]){
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter number:");
		n=s.nextInt();
		Armstrong xy=new Armstrong();
		xy.set(n);
		System.out.println(xy.checkArmstrong());
	}
}