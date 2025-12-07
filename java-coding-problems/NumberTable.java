import java.util.*;

class table{
	int x;
	void set(int x){
		this.x=x;
	}
	void show(){
		for(int i=1;i<=10;i++)
		System.out.println(x+"*"+i+"="+i*x);
	}
}
public class NumberTable{
	public static void main(String x[]){
		Scanner s=new Scanner(System.in);
		table t=new table();
		int xy;
		System.out.println("Enter number:");
		xy=s.nextInt();
		t.set(xy);
		t.show();
	}
}