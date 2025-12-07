class A extends Thread{
    public void run(){
        try{
            int x=4;
            for(int i=1;i<10;i++){
                System.out.printf("%d * %d = %d\n",x,i,x*i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e1){}
    }
}
class B extends Thread{
    public void run(){
        try{
            for(int i=1;i<10;i++){
                System.out.printf("Hell0\n");
                Thread.sleep(1000);               
            }
        }
        catch(InterruptedException e1){}
    }
}
public class Mult{
    public static void main(String y[])throws InterruptedException{
        A a1=new A();
        a1.start();
        B b1=new B();
        b1.start();
        for(int i=1;i<10;i++){
            System.out.printf("******\n");
            Thread.sleep(1000);
        }
    }
}