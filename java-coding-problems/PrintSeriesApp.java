import java.util.*;

class PrintSeries
{
  int limit;
  void setLimit(int limit)
  {
    this.limit=limit;
  }
  void show()
  { 
    int num=1;
    for(int i=0;i<limit;i++)
    {
      System.out.print(num+" ");
      num=num*10+1;
    }
  }
}
public class PrintSeriesApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    PrintSeries p=new PrintSeries();
    int limit;
    System.out.println("Enter limit:");
    limit=sc.nextInt();
    p.setLimit(limit);
    p.show();
  }
}
