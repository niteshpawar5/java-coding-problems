import java.util.*;
abstract class Identity
{
  int a[][];
  void acceptMatrix(int a[][])
  {
    this.a=a;
  }
  abstract boolean checkIdentify();
}
class CheckIdentity extends Identity
{
  boolean checkIdentify()
  {
    boolean flag=false;
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      {
        if(i==j && a[i][j]==1)
        flag=true;
        else if(i!=j && a[i][j]==0)
        flag=true;
        else
        flag=false;
      }
    }
    return flag;
  }
}
public class IdentityApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[3][3];
    System.out.println("Enter array elements:");
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    CheckIdentity c1=new CheckIdentity();
    c1.acceptMatrix(a);
    if(c1.checkIdentify())
    System.out.println("It is identity matrix");
    else
    System.out.println("It is not identity matrix");
  }
}
