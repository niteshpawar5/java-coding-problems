import java.util.*;
class StudentPojo
{
  private int id;
  private String name;
  private int per;
  public void setId(int id){
    this.id=id;
  }
  public int getId(){
    return id;
  }
  public void setName(String name){
    this.name=name;
  }
  public String getName(){
    return name;
  }
  public void setPer(int per){
    this.per=per;
  }
  public int getPer(){
    return per;
  }
}
public class StudentPojoApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    StudentPojo sp[]=new StudentPojo[5];
    for(int i=0;i<5;i++)
    {
      sp[i]=new StudentPojo();
      System.out.println("Enter id, name and percentage:");
      int id=sc.nextInt();
      String name=sc.next();
      int per=sc.nextInt();
      sp[i].setId(id);
      sp[i].setName(name);
      sp[i].setPer(per);
    }
    System.out.println("Students Data:");
    for(int i=0;i<5;i++)
    {
      System.out.println(sp[i].getId()+" "+sp[i].getName()+" "+sp[i].getPer());
    }
    for(int i=0;i<5;i++)
    {
      StudentPojo temp=new StudentPojo();
      for(int j=i+1;j<5;j++){
        if(sp[i].getPer()>sp[j].getPer()){
          temp=sp[i];
          sp[i]=sp[j];
          sp[j]=temp;
        }
      }
    }
    System.out.println("Second highest marks records:");
    System.out.println(sp[3].getId()+" "+sp[3].getName()+" "+sp[3].getPer());
  }
}
