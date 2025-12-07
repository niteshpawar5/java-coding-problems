import java.util.*;

class CheckPrime
{
  int no;
  CheckPrime(int no)
  {
    this.no=no;
  }
  boolean isPrime()
  {
    boolean flag=false;
    if(no<=2){
      if(no==2)
      flag=true;
    }
    else{
      for(int i=2;i<no/2;i++){
        if(no%i==0){
          flag=false;
          break;
        }
        else
        flag=true;
      }
    }
    return flag;
  }
}
public class CheckPrimeApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    int no;
    System.out.println("Enter number:");
    no=sc.nextInt();
    CheckPrime cp=new CheckPrime(no);
    if(cp.isPrime())
    System.out.println(no+" is a prime number");
    else
    System.out.println(no+" is not a prime number");
  }
}
