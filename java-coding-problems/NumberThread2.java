// class Asc implements Runnable{
// 	public void run(){
// 		try{
// 			for(int i=1;i<=10;i++){
// 				Thread.sleep(1000);
// 				System.out.println(i+" ");
// 			}
// 		}
// 		catch(InterruptedException e){}
// 	}
// }
class Desc implements Runnable{
	public void run(){
		try{
			Thread.sleep(1000);
			for(int i=10;i>=1;i--){
				System.out.print(i+" ");
			}
		}
		catch(InterruptedException e){}
	}
}
public class NumberThread2{
	public static void main(String[] args) {
		// Asc a=new Asc();
		// Thread t1=new Thread(a);
		// t1.start();
		Desc d=new Desc();
		Thread t2=new Thread(d);
		t2.start();
	}
}