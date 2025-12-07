import java.util.*;

class FindRowSum
{
  int a[][];
  FindRowSum(int a[][])
  {
    this.a=a;
  }
  void getSum()
  {
    for(int i=0;i<a.length;i++)
    {
      int sum=0;
      for(int j=0;j<a[i].length;j++)
      {
        sum+=a[i][j];
      }
      System.out.println("Sum of row "+(i+1)+" is "+sum);
    }
  }
}
public class FindRowSumApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[3][3];
    System.out.println("Enter array elements:");
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a[i].length;j++){
        a[i][j]=sc.nextInt();
      }
    }
    FindRowSum fr=new FindRowSum(a);
    fr.getSum();
  }
}
