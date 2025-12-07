import java.util.*;
abstract class TestArray
{
  int a[];
  void setArray(int a[])
  {
    this.a=a;
  }
  abstract int getResult();
}
class Sum extends TestArray
{
  int getResult()
  {
    int sum=0;
    for(int i=0;i<a.length;i++)
    { sum+=a[i];
    }
    return sum;
  }
}
class FindMax extends TestArray
{
  int getResult()
  {
    int max=0;
    for(int i=0;i<a.length;i++)
    { if(a[i]>max)
      max=a[i];
    }
    return max;
  }
}
public class ArrayOpApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    int size;
    System.out.print("Enter size of array: ");
    size=sc.nextInt();
    int a[]=new int[size];
    System.out.println("Enter array elements:");
    for(int i=0;i<a.length;i++)
    a[i]=sc.nextInt();
    Sum s1=new Sum();
    s1.setArray(a);
    System.out.print("Sum of all array elements: "+s1.getResult());
    System.out.println();
    FindMax f1=new FindMax();
    f1.setArray(a);
    System.out.print("Max of all array elements: "+f1.getResult());
  }
}

