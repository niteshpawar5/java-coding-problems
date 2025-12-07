class Armstrong implements Runnable{
	public void run(){
		for(int i=1;i<500;i++){
			int count=0,n=i,m=i,sum=0;
			while(n!=0){
				count++;
				n/=10;
			}
			while(m!=0){
				int rem=m%10,value=1;
				for(int k=1;k<=count;k++){
					value*=rem;
				}
				sum+=value;
				m/=10;
			}
			try{
				if(sum==i){
					Thread.sleep(1000);
					System.out.println(i+"--> Armstrong");
				}
			}
			catch(InterruptedException e){}
			sum=0;
		}
	}
}
class Prime implements Runnable{
	public void run(){
		for(int i=2;i<=50;i++){
			try{
				if(i==2){
					Thread.sleep(1000);
					System.out.println(i+"--> Prime");
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
						System.out.println(i+"--> Prime");
					}
				}
			}
			catch(InterruptedException e1){}
		}
	}
}
public class ThreadRun{
	public static void main(String x[]) {
		Armstrong a1=new Armstrong();
		Thread t=new Thread(a1);
		t.start();
		Prime p1=new Prime();
		t=new Thread(p1);
		t.start();
	}
}