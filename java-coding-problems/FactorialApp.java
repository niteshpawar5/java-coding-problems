import java.util.*;

class Factorial{
	int x;
	void set(int y){
		x=y;
	}
	int show(){
		int n=1;
		while(x!=0){
			n=n*x;
			--x;
		}
		return n;
	}
}
public class FactorialApp{
	public static void main(String x[]){
		Factorial f=new Factorial();
		Scanner s=new Scanner(System.in);
		int n;
		System.out.printf("Enter number:\n");
		n=s.nextInt();
		f.set(n);
		System.out.println("Factorial of "+n+" is "+f.show());
	}
}