import java.util.*;

class Interest
{
  float amt,rate,dur;
  void setPRD(float amt,float rate,float dur)
  {
    this.amt=amt;
    this.rate=rate;
    this.dur=dur;
  }
}
class CalInterest extends Interest
{
  void calInterest()
  {
    float si=(amt*rate*dur)/100;
    System.out.println("Simple Interest is "+si+" rupees");
  }
}
public class SimpleInterest
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    float amt,rate,dur;
    System.out.print("Enter principle amount: ");
    amt=sc.nextFloat();
    System.out.print("Enter rate of interest: ");
    rate=sc.nextFloat();
    System.out.print("Enter duration in years: ");
    dur=sc.nextFloat();
    CalInterest c1=new CalInterest();
    c1.setPRD(amt,rate,dur);
    c1.calInterest();
  }
}
