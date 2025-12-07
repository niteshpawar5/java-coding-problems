public class StarThread {
	public static void main(String[] args) throws InterruptedException{
		for(int i=1;i<=4;i++){
			for(int j=1;j<=5;j++){
				Thread.sleep(1000);
				System.out.print("* ");
			}
			Thread.sleep(1000);
			System.out.println();
		}		
	}
}