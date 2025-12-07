import java.util.*;

class FindHCF
{
  int a,b,c;
  void setNumbers(int first,int second)
  {
    a=first;
    b=second;
  }
  void findHCF()
  {
    if(a<b)
    c=a;
    else
    c=b;
    for(int i=c;i>=1;i--)
    {
      if(a%i==0 && b%i==0)
      {
        System.out.println("HCF is "+i);
        break; 
      }
    }
  }
}
public class FindHCFApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    FindHCF hf=new FindHCF();
    int a,b;
    System.out.println("Enter two numbers:");
    a=sc.nextInt();
    b=sc.nextInt();
    hf.setNumbers(a,b);
    hf.findHCF();
  }
}
