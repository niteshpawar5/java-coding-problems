public class PythonPattern
{
  public static void main(String x[])
  {
    char ch[]=new char[]{'p','y','t','h','o','n'};
    for(int i=1;i<=11;i++)
    {
      for(int j=1;j<=6;j++)
      {
        if(i<=6 && j<=i)
        System.out.print(ch[j-1]);
        else if(i>6 && j<=12-i)
        System.out.print(ch[j-1]);
      }
      System.out.println();
    }
  }
}
