import java.util.*;
abstract class Character
{
  char ch[];
  void setValue(char ch[])
  {
    this.ch=ch;
  }
  abstract int getResult();
}
class GetLength extends Character
{
  int getResult()
  {
    int count=0;
    for(int i=0;i<ch.length;i++)
    count++;
    return count;
  }
}
public class CharApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String:");
    String s=sc.nextLine();
    char ch[]=s.toCharArray();
    GetLength g=new GetLength();
    g.setValue(ch);
    System.out.print("Length of String: "+g.getResult());
  }
}

