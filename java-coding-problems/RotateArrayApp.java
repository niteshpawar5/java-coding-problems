import java.util.*;
class RotateArray
{
  int a[];
  void setArray(int a[])
  {
    this.a=a;
  }
  void rotate(int index)
  {
    while(index!=0)
    {
      for(int i=a.length-1;i>0;i--)
      {
        int t=a[i];
        a[i]=a[i-1];
        a[i-1]=t;
      }
      index--;
    }
  }
  void display()
  {
     for(int i=0;i<a.length;i++)
     System.out.print(a[i]+" ");  
  }
}
public class RotateArrayApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    RotateArray ra=new RotateArray();
    int length,k;
    System.out.println("Enter array size:");
    length=sc.nextInt();
    int a[]=new int[length];
    System.out.println("Enter array elements:");
    for(int i=0;i<a.length;i++)
    a[i]=sc.nextInt();
    System.out.println("Enter value to rotate:");
    k=sc.nextInt();
    ra.setArray(a);
    System.out.println("Array before rotation:");
    ra.display();
    ra.rotate(k);
    System.out.println();
    System.out.println("Array after rotation:");
    ra.display();
  }
}
