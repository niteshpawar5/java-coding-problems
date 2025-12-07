class Prior extends Thread{
	public void run(){
		String s=getName();
		System.out.println(s);
	}
}
public class ThreadPrior{
	public static void main(String[] args) {
		Prior p1=new Prior();
		Prior p2=new Prior();
		Prior p3=new Prior();

		p1.setName("Thread 1");
		p2.setName("Thread 2");
		p3.setName("Thread 3");

		p1.setPriority(Thread.MAX_PRIORITY);
		p2.setPriority(Thread.MIN_PRIORITY);
		p3.setPriority(Thread.NORM_PRIORITY);

		p1.start();
		p2.start();
		p3.start();
	}
}