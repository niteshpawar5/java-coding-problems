import java.util.*;

abstract class FindOddCount
{
  int a[];
  void setValue(int a[])
  {
    this.a=a;
  }
  abstract void result();
}
class FindOdd extends FindOddCount
{
  void result()
  {
    int b[]=new int[a.length];
    for(int i=0;i<a.length;i++)
    b[i]=a[i];
    for(int i=0;i<a.length;i++)
    {
      int count=0;
      for(int j=0;j<b.length;j++)
      {
        if(a[i]==b[j])
        {
          count++;
          b[j]=0;
        }
      }
      if(count%2!=0 && count>0)
      System.out.println(a[i]+"--->"+count);
    }
  }
}
public class FindOddCountApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    System.out.println("Enter array elements:");
    for(int i=0;i<a.length;i++)
    a[i]=sc.nextInt();
    FindOdd f1=new FindOdd();
    f1.setValue(a);
    System.out.println("Odd count elements are:");
    f1.result();
  }
}
