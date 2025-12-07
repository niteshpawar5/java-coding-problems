import java.util.*;
class FindMajority{
  int a[],flag=0;
  void setArray(int a[]){
    this.a=a;
  }
  void display(){
    for(int i=0;i<a.length;i++)
    System.out.printf("%d ",a[i]);
    System.out.println();
  }
  void getMajority(){
    int mid=a.length/2;
    for(int i=0;i<=a.length;i++)
    {
      int count=1;
      for(int j=i+1;j<a.length;j++)
      {
        if(a[i]==a[j])
        {
          count++;
        }
      }
      if(count>mid)
      {
        flag=1;
        System.out.printf("Majority Element is %d ",a[i]);
        break;
      }
    }
    if(flag==0)
         System.out.printf("No majority Element");
  }
}
public class FindMajorityApp{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
    FindMajority fm=new FindMajority();
    int size;
    System.out.println("Enter size of array:");
    size=sc.nextInt();
    int a[]=new int[size];
    System.out.println("Enter array elements:");
    for(int i=0;i<a.length;i++)
    a[i]=sc.nextInt();
    fm.setArray(a);
    System.out.println("Array is:");
    fm.display();
    fm.getMajority();
  }
}
