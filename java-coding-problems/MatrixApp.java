import java.util.*;
abstract class Matrix
{
  int a[][];
  void setValue(int a[][])
  {
    this.a=a;
  }
  abstract void display();
}
class Transpose extends Matrix
{
  void display()
  {
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      {
        if(i!=j && i<2 && j>0)
        {
          int t=a[i][j];
          a[i][j]=a[j][i];
          a[j][i]=t;
        }
      }
    }
    System.out.println("After Transform:");
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      System.out.print(a[i][j]+" ");
      System.out.println();
    }
  }
}
class SettingZeroInLowerTraingle extends Matrix
{
  void display()
  {
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      {
        if(i>0 && j<2)
        {
          if(i!=j)
          a[i][j]=0;
        }
      }
    }
    System.out.println("After Transform:");
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      System.out.print(a[i][j]+" ");
      System.out.println();
    }
  }
}
public class MatrixApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[3][3];
    System.out.println("Enter values in array:");
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      a[i][j]=sc.nextInt();
    }
    Transpose t1=new Transpose();
    t1.setValue(a);
    t1.display();
    SettingZeroInLowerTraingle s1=new SettingZeroInLowerTraingle();
    s1.setValue(a);
    s1.display();
  }
}
