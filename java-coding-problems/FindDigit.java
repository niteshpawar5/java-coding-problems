import java.util.*;

class find{
	int n,sdigit;
	void set(int n,int sdigit){
		this.n=n;
		this.sdigit=sdigit;
	}	
	boolean isDigitFound(){
		boolean check=false;
		while(n!=0){
			int rem=n%10;
			if(rem==sdigit){
				check=true;
				break;
			}
			n/=10;
		}
		return check;
	}
}
public class FindDigit{
	public static void main(String x[]){
		Scanner s=new Scanner(System.in);
		find f=new find();
		int n,m;
		System.out.println("Enter number and digit to find:");
		n=s.nextInt();
		m=s.nextInt();
		f.set(n,m);
		System.out.println(f.isDigitFound());
	}
}