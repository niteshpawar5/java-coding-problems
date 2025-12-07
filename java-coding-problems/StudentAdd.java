import java.util.*;
class POJOStudent
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

class StudentAdd{
  public static void main(String args[])
  {
     Student stud[]=new Student[5];
     for(int i=0; i<stud.length; i++)
     {
       Scanner xyz=new Scanner(System.in);
       stud[i]=new Student();
       System.out.println("Enter name id per");
       String name=xyz.nextLine();
       int id=xyz.nextInt();
       int per=xyz.nextInt();
       
       stud[i].setId(id);
       stud[i].setName(name);
       stud[i].setPer(per);
     }
       for(int i=0; i<stud.length; i++)
       {
        System.out.println(stud[i].getId()+"\t"+stud[i].getName()+"\t"+stud[i].getPer());
       }
     }
   }

