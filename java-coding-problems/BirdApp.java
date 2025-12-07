import java.util.*;

public class BirdApp{
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int size1=a.length;
        for(int i=0;i<size1;i++)
        a[i]=sc.nextInt();
        

        int b[]=new int[5],max=0;
        int size2=b.length;
        for(int i=0;i<size1;i++){
            int count=0;
            for(int j=0;j<size1;j++){
                if(a[i]==a[j]){
                    count++;
                    b[a[i]-1]=count;
                }
            }
        }
        for(int i=0;i<10;i++){
            if(i<5 && b[i]>max)
            max=b[i];
            else if(i>=5 && b[i-5]==max){
                System.out.println(i-4);
                break;  
            }
        }
    }
}