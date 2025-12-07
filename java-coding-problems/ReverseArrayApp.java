import java.util.*;

class ReverseArray{
   int a[];
   void setArray(int a[]){
      this.a=a;
   }
   void performReverse(){
      int end=a.length-1;
      for(int i=0;i<a.length/2;i++,end--){
         int t=a[i];
         a[i]=a[end];
         a[end]=t;
      }
   }
   void display(){
      for(int i=0;i<5;i++)
      System.out.printf("%d ",a[i]);
   }
}
public class ReverseArrayApp{
   public static void main(String x[]){
      Scanner sc=new Scanner(System.in);
      ReverseArray ra=new ReverseArray();
      int a[]=new int[5];
      System.out.println("Enter array elements:");
      for(int i=0;i<5;i++)
      a[i]=sc.nextInt();
      ra.setArray(a);
      System.out.println("Array before reverse:");
      ra.display();
      ra.performReverse();
      System.out.println("\nArray after reverse:");
      ra.display();
   }
}