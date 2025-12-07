class Pattern3
{
  void showPattern()
  {
    for(int i=1;i<=5;i++)
    {
      char c='a';
      for(int j=1;j<=5;j++)
      {
        if(i%2!=0 && j<=i)
        {
          if(j%2!=0)
          {
            System.out.print(c+" ");
            c++;
            c-=32;
          }
          else
          {
            System.out.print(c+" ");
            c++;
            c+=32;
          }
        }
        else if(j<=i)
        {
          if(j%2!=0)
          {
            c-=32;
            System.out.print(c+" ");
            c++;
          }
          else
          {
            c+=32;
            System.out.print(c+" ");
            c++;
          }
        }
      }
      System.out.println();
    }
  }
}
public class Pattern3App
{
  public static void main(String x[])
  {
    Pattern3 p=new Pattern3();
    p.showPattern();
  }
}
