class ABC{
	int x,y;
	// ABC(int x,int y){
	// 	this.x=x;
	// 	this.y=y;
	// }
	void cal(int x,int y){
		System.out.println(x+y);
	}
	void cal(int y,int x){
		System.out.println(y-x);
	}
}
public class ABCAPP{
	public static void main(String[] args) {
		int x=10,y=5;
		ABC a1=new ABC(x,y);
		
		a1.cal(x,y);
		a1.cal(y,x);
	}
}