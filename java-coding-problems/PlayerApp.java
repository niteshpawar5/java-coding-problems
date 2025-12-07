class Player
{
  private int id;
  private String name;
  private int run;
  private int age;
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
  public void setRun(int run){
    this.run=run;
  }
  public int getRun(){
    return run;
  }
   public void setAge(int age){
    this.age=age;
  }
  public int getAge(){
    return age;
  }
}
class Team
{
  Player p;
  void setPlayer(Player p1)
  {
    p=p1;
  }
  void show()
  {
    if(p.getAge()>38)
    System.out.println("You can retire after 2 years");
    else
    System.out.println(p.getId()+" "+p.getName()+" "+p.getRun()+" "+p.getAge());
  }
}
public class PlayerApp
{
  public static void main(String x[])
  {
    Player p=new Player();
    Team t=new Team();
    p.setId(1);
    p.setName("Bhushan");
    p.setRun(216);
    p.setAge(39);
    t.setPlayer(p);
    t.show();
  }
}
