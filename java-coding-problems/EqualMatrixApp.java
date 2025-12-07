import java.util.*;
abstract class Matrix
{
  int [][]a,b;
  void acceptMatrices(int a[][],int b[][])
  {
    this.a=a;
    this.b=b;
  }
  abstract boolean checkEquality();
}
class Check extends Matrix
{
  boolean checkEquality()
  {
    boolean flag=true;
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      {
        if(a[i][j]!=b[i][j])
        flag=false;
      }
    }
    return flag;
  }
}
public class EqualMatrixApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    int [][]a,b;
    a=new int[3][3];
    b=new int[3][3];
    System.out.println("Enter elements in 1'st array:");
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    System.out.println("Enter elements in 2'nd array:");
    for(int i=0;i<b.length;i++)
    {
      for(int j=0;j<b[i].length;j++)
      {
        b[i][j]=sc.nextInt();
      }
    }
    Check c1=new Check();
    c1.acceptMatrices(a,b);
    System.out.println(c1.checkEquality());
  }
}
