import java.util.*;

class GetSeries
{
  int limit;
	void setLimit(int limit)
	{
	  this.limit=limit;
	}
	void getSeries()
	{
	  for(int i=1;i<=limit;i++)
	  System.out.print(i*i*i+" ");
	}
}
public class GetSeriesApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    GetSeries gs=new GetSeries();
    int limit;
    System.out.println("Enter Limit:");
    limit=sc.nextInt();
    gs.setLimit(limit);
    gs.getSeries();
  }
}
