import java.util.*;

class FindSecondHighest{
   int a[];
   void setArray(int a[]){
      this.a=a;
   }
   int getSecondHighest(){
      for(int i=0;i<5;i++){
         for(int j=i+1;j<5;j++){
            if(a[i]>a[j]){
               int t=a[i];
               a[i]=a[j];
               a[j]=t;
            }
         }
      }
      return a[3];
   }
   void display(){
      for(int i=0;i<5;i++)
      System.out.printf("%d ",a[i]);
   }
}
class FindSecondHighestApp{
   public static void main(String x[]){
      Scanner sc=new Scanner(System.in);
      FindSecondHighest fs=new FindSecondHighest();
      int a[]=new int[5];
      System.out.println("Enter array elements:");
      for(int i=0;i<5;i++)
      a[i]=sc.nextInt();
      fs.setArray(a);
      System.out.println("Array elements:");
      fs.display();
      System.out.println("Second highest element: "+fs.getSecondHighest());
   }
}