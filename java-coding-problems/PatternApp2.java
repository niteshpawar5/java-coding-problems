class Pattern2
{
  void show()
  {  
    for(int i=1;i<=4;i++)
    { char c='A';
      for(int j=1;j<=7;j++)
      {
        if(j>=5-i && j<4)
        {
          System.out.print(c+" ");
          c++;
        }      
        else if(j>=4 && j<=i+3)
        {
          System.out.print(c+" ");
          c--;
        }
        else
        System.out.print("  ");
      }
      System.out.println();
    }
  }
}
public class PatternApp2
{
  public static void main(String x[])
  {
    Pattern2 p=new Pattern2();
    p.show();
  }
}
