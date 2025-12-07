public class PrimeThread{
	public static void main(String x[])throws InterruptedException{
		for(int i=2;i<=50;i++){
			if(i==2){
				Thread.sleep(1000);
				System.out.print(i+" ");
			}
			else{
				boolean flag=true;
				for(int j=2;j<=i/2;j++){
					if(i%j==0){
						flag=false;
						break;
					}
				}
				if(flag){
					Thread.sleep(1000);
					System.out.print(i+" ");
				}
			}
		}
		System.out.println();
	}
}