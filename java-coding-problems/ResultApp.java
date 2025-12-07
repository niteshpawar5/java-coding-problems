import java.util.*;

class Per
{
  int per;
  void calPer(int sub[])
  {
    int sum=0;
    for(int i=0;i<sub.length;i++)
    sum+=sub[i];
    per=sum/6;
  }
}
class CSE extends Per
{
  int id;
  String name,address,year;
  CSE(int id,String name,String address,String year)
  {
    this.id=id;
    this.name=name;
    this.address=address;
    this.year=year;
  }
  void show()
  {
    System.out.println("#ID-"+id+" #NAME-"+name+" #ADDRESS-"+address+" #YEAR-"+year);
  }
  void showCSEPer()
  {
    System.out.println("Percentage of CSE is "+per+"%");
  }
}
class ETC extends Per
{
  int id;
  String name,address,year;
  ETC(int id,String name,String address,String year)
  {
    this.id=id;
    this.name=name;
    this.address=address;
    this.year=year;
  }
  void show()
  {
    System.out.println("#ID-"+id+" #NAME-"+name+" #ADDRESS-"+address+" #YEAR-"+year);
  }
  void showETCPer()
  {
    System.out.println("Percentage of ETC is "+per+"%");
  }
}
class ResultApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    int id,sub[]=new int[6];
    String name,address,year;
    System.out.println("Enter Id: ");
    id=sc.nextInt();
    System.out.println("Enter Name: ");
    name=sc.next();
    System.out.println("Enter Address: ");
    address=sc.next();
    System.out.println("Enter Year: ");
    year=sc.next();
    CSE c1=new CSE(id,name,address,year);
    System.out.println("Enter marks of cse:");
    for(int i=0;i<sub.length;i++)
    sub[i]=sc.nextInt();
    c1.show();
    c1.calPer(sub);
    c1.showCSEPer();
    ETC e1=new ETC(id,name,address,year);
    System.out.println("Enter marks of etc:");
    for(int i=0;i<sub.length;i++)
    sub[i]=sc.nextInt();
    e1.show();
    e1.calPer(sub);
    e1.showETCPer();
  }
}
