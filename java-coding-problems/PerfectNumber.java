import java.util.*;

class Perfect{
	int n;
	void set(int n){
		this.n=n;
	}
	boolean checkPerfect(){
		int per=0;
		boolean check=false;
		for(int i=1;i<n;i++){
			if(n%i==0)
			per+=i;
		}
		if(n==per)
		check=true;
		return check;
	}
}
public class PerfectNumber{
	public static void main(String x[]){
		Scanner s=new Scanner(System.in);
		Perfect p=new Perfect();
		int n;
		System.out.println("Enter Number:");
		n=s.nextInt();
		p.set(n);
		System.out.println(p.checkPerfect());
	}
}
