class Pattern
{
  void show()
  {
    for(int i=1;i<=5;i++)
    {
      for(int j=1;j<=i;j++)
      {
        if(j<=i && i%2!=0)
        {
          if(j%2!=0)
          System.out.print("1 ");
          else
          System.out.print("0 ");
        }
        else if(j<=i)
        {
          if(j%2!=0)
          System.out.print("0 ");
          else
          System.out.print("1 ");
        }
      }
      System.out.println();
    }
  }
}
public class PatternApp
{
  public static void main(String x[])
  {
    Pattern p=new Pattern();
    p.show();
  }
}
