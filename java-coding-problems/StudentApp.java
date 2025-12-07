class Student
{
  private int id;
  private String name;
  private float per;
  private float fees;
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
  public void setPer(float per){
    this.per=per;
  }
  public float getPer(){
    return per;
  }
   public void setFees(float fees){
    this.fees=fees;
  }
  public float getFees(){
    return fees;
  }
}
class College
{ float fees;
  Student sd;
  void addNewStudent(Student sdu)
  { 
    sd=sdu;
    fees=sd.getFees();
    if(sd.getPer()>70)
    fees=fees-(20*fees)/100;
  }
  void show()
  {
    System.out.println(sd.getId()+" "+sd.getName()+" "+sd.getPer()+" "+fees);
  }
}
public class StudentApp
{
  public static void main(String x[])
  {
    Student sd=new Student();
    College cg=new College();
    sd.setId(1);
    sd.setName("Bhushan");
    sd.setPer(91);
    sd.setFees(12000);
    cg.addNewStudent(sd);
    cg.show();
  }
}
