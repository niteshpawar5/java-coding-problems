import java.util.*;
class Validate
{
  char ch[];
  void setValue(char ch[])
  {
    this.ch=ch;
  }
}
class ValidateName extends Validate
{ 
  boolean checkName()
  {
    boolean flag=false;
    for(int i=0;i<ch.length;i++)
    {
      if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z') || ch[i]==' ')
      {
        flag=true;
      }
      else
      {
        flag=false;
        break;
      }
    }
    return flag;
  }
}
class ValidateNumber extends Validate
{ 
  boolean checkNumber()
  {
    boolean flag=false;
    for(int i=0;i<ch.length;i++)
    {
      if(ch[i]>='0' && ch[i]<='9')
      {
        flag=true;
      }
      else
      {
        flag=false;
        break;
      }
    }
    return flag;
  }
}
class ValidateEmail extends Validate
{ 
  boolean checkEmail()
  {
    boolean flag=false;
    int count1=0,count2=0;
    for(int i=0;i<ch.length;i++)
    {
      if(ch[i]=='@')
      count1++;
      else if(ch[i]=='.')
      count2++;
    }
    for(int i=0;i<ch.length;i++)
    {
      if(count1!=1 || count2<1 || ch[0]=='@')
      {
        flag=false;
        break;
      }
      else if((ch[i]>='a' && ch[i]<='z') || ch[i]=='.' || ch[i]=='@')
      {
        flag=true;
      }
      else{
        flag=false;
        break;
      }
    }
    return flag;
  }
}

public class ValidateApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter choice:");
    System.out.println("1.Validate Name");
    System.out.println("2.Validate Number");
    System.out.println("3.Validate Email");
    int choice=sc.nextInt();
    System.out.println("input:");
    String s=sc.next();
    char ch[]=s.toCharArray();
    switch(choice){
      case 1: ValidateName v=new ValidateName();
              v.setValue(ch);
              if(v.checkName())
              System.out.println("Name is valid");
              else
              System.out.println("Name is not valid");
              break;
      
      case 2: ValidateNumber n=new ValidateNumber();
              n.setValue(ch);
              if(n.checkNumber())
              System.out.println("Number is valid");
              else
              System.out.println("Number is not valid");
              break;
      
      case 3: ValidateEmail e=new ValidateEmail();
              e.setValue(ch);
              if(e.checkEmail())
              System.out.println("Email is valid");
              else
              System.out.println("Email is not valid");
              break;
              
      default: System.out.println("Invalid choice!!!");
    }
  }
}
