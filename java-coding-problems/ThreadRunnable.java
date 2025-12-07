class Fib implements Runnable{
	public void run(){
		try{
			int t1=0,t2=1,t3=0;
			Thread.sleep(1000);
			System.out.printf("%d -->FibonacciSeries[1]\n",t1);
			Thread.sleep(1000);
			System.out.printf("%d -->FibonacciSeries[2]\n",t2);
			for(int i=3;i<=10;i++){
				t3=t1+t2;
				t1=t2;
				t2=t3;
				Thread.sleep(1000);
				System.out.printf("%d -->FibonacciSeries[%d]\n",t3,i);
			}
		}
		catch(InterruptedException e){}
	}
}
class Even implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			if(i%2==0){
				try{
					Thread.sleep(1000);
					System.out.printf("%d -->Even Number\n",i);
				}
				catch(InterruptedException e){}
			}
		}
	}
}
public class ThreadRunnable{
	public static void main(String x[]){
		Fib f=new Fib();
		Thread t1=new Thread(f);
		t1.start();
		Even e=new Even();
		t1=new Thread(e);
		t1.start();
	}
}