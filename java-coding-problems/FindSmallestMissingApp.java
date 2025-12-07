import java.util.*;

class FindSmallestMissing{
  int a[];
  void setArray(int a[]){
    this.a=a;
  }
  void display(){
    for(int i=0;i<5;i++)
    System.out.printf("%d ",a[i]);
    System.out.println();
  }
  int smallestMissing(){
    for(int i=0;i<5;i++){
      for(int j=i+1;j<5;j++){
        if(a[i]>a[j]){
          int t=a[i];
          a[i]=a[j];
          a[j]=t;
        }
      }
    }
    int smallest=0;
    for(int i=a[0];i<a[a.length-1];i++){
      boolean flag=true;
      smallest=i;
      for(int j=0;j<5;j++){
        if(a[j]==i){
          flag=false;
          break;
        }
      }
      if(flag)
      break;
    }
    return smallest;
  }
}
public class FindSmallestMissingApp{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
    FindSmallestMissing fs=new FindSmallestMissing();
    int a[]=new int[5];
    System.out.println("Enter elements in array:");
    for(int i=0;i<5;i++)
    a[i]=sc.nextInt();
    fs.setArray(a);
    System.out.println("Array is:");
    fs.display();
    System.out.println("Smallest missing elements is: "+fs.smallestMissing());
  }
}
