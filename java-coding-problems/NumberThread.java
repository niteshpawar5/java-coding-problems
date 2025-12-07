public class NumberThread{
	public static void main(String x[])throws InterruptedException{
		for(int i=1;i<=10;i++){
			Thread.sleep(1000);
			System.out.print(i+" ");
		}
		System.out.println();
	}
}