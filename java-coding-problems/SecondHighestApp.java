import java.util.*;
abstract class ArrayParent
{
  int a[];
  void setArray(int a[])
  {
    this.a=a;
  }
  abstract int getSecondHighest();
}
class FindSecondHighest extends ArrayParent
{
  int getSecondHighest()
  {
    int max1=0,max2=0;
    for(int i=0;i<a.length;i++)
    {
      if(a[i]>max1)
      max1=a[i];
    }
    for(int i=0;i<a.length;i++)
    {
      if(a[i]>max2 && a[i]<max1)
      max2=a[i];
    }
    return max2; 
  }
}
public class SecondHighestApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    System.out.println("Enter array elements:");
    for(int i=0;i<a.length;i++)
    a[i]=sc.nextInt();
    FindSecondHighest f1=new FindSecondHighest();
    f1.setArray(a);
    System.out.println("Second highest element is "+f1.getSecondHighest());
  }
}
