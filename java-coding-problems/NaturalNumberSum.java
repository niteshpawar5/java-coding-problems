import java.util.*;

class sum{
	int n;
	void set(int n){
		this.n=n;
	}
	int getSum(){
		int s=0;
		for(int i=1;i<=n;i++)
		s+=i;
		return s;
	}
}
public class NaturalNumberSum{
	public static void main(String x[]){
		Scanner s=new Scanner(System.in);
		sum m=new sum();
		int n;
		System.out.println("Enter range for natural number:");
		n=s.nextInt();
		m.set(n);
		System.out.println("Sum is: "+ m.getSum());
	}
}