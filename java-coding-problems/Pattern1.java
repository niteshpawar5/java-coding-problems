public class Pattern1{
	public static void main(String x[]){
		for(int i=1;i<=10;i++){
			for(int j=1;j<=10;j++){
				if(i<=5){
					if(j<=i && j>=11-i)
					System.out.printf("* ");
					else 
					System.out.printf("  ");
				}
			}
			System.out.printf("\n");
		}
	}
 }