import java.util.*;

class FindMissing{
  int a[];
  void setArray(int a[]){
    this.a=a;
  }
  void findMissing(){
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[i]>a[j]){
          int t=a[i];
          a[i]=a[j];
          a[j]=t;
        }
      }
    }
    int min=a[0];
    int max=a[a.length-1];
    for(int i=min+1;i<max;i++){
      boolean flag=true;
        for(int j=0;j<a.length;j++){
          if(i==a[j]){
            flag=false;
            break;
          }
        }
        if(flag)
        System.out.printf("%d ",i); 
      } 
  }
}
public class FindMissingApp{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
    FindMissing fm=new FindMissing();
    int a[]=new int[5];
    System.out.println("Enter array elements:");
    for(int i=0;i<5;i++)
    a[i]=sc.nextInt();
    fm.setArray(a);
    System.out.println("Missing elements are:");
    fm.findMissing();
  }
}
