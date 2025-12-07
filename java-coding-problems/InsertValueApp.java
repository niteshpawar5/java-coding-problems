import java.util.*;
class InsertValue
{
  int a[];
  void setArray(int a[])
  { this.a=a;
  }
  void setIndex(int index,int value)
  { for(int i=a.length-1;i>=index-1;i--)
    a[i]=a[i-1];
    a[index-1]=value;
  }
  void display(int size)
  {
    for(int i=0;i<size;i++)
    System.out.print(a[i]+" ");
  }
}
public class InsertValueApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    InsertValue iv=new InsertValue();
    int index,value,size,a[];
    System.out.println("Enter size of array");
    size=sc.nextInt();
    a=new int[size+1];
    System.out.println("Enter elements of array");
    for(int i=0;i<a.length-1;i++)
    a[i]=sc.nextInt();
    System.out.println("Enter index and value to add:");
    index=sc.nextInt();
    value=sc.nextInt();
    iv.setArray(a);
    System.out.println("Array before insertion");
    iv.display(a.length-1);
    System.out.println();
    iv.setIndex(index,value);
    System.out.println("Array after insertion");
    iv.display(a.length);
  }
}
