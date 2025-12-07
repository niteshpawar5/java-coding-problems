import java.util.*;

class FindDigit
{
  char ch[];
  FindDigit(char ch[])
  {
    this.ch=ch;
  }
  int getDigitCount()
  {
    int count=0;
    for(int i=0;i<ch.length;i++)
    {
      if(ch[i]>='0' && ch[i]<='9')
      count++;
    }
    return count;
  }
}
public class FindDigitApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    int size;
    System.out.println("Enter array size:");
    size=sc.nextInt();
    char ch[]=new char[size];
    System.out.println("Enter characters:");
    for(int i=0;i<ch.length;i++)
    ch[i]=sc.next().charAt(0);
    FindDigit fd=new FindDigit(ch);
    System.out.println("Count of digit: "+fd.getDigitCount());
  }
}
