import java.util.*;
//6000 balance
class Power{
	int x,y;
	void set(int x,int y){
		this.x=x;
		this.y=y;
	}
	int show(){
		int result=1;
		while(x!=0){
			result*=y;
			x--;
		}
		return result;
	}
}
public class PowerApp{
	public static void main(String x[]){
		Scanner s=new Scanner(System.in);
		Power p=new Power();
		System.out.println("Enter index and base:");
		int pow,ind;
		pow=s.nextInt();
		ind=s.nextInt();
		p.set(ind,pow);
		System.out.println("Result :"+p.show());
	}
}