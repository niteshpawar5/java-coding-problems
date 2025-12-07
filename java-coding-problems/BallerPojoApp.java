class Baller
{
  private int id;
  private String name;
  private int nwicket;
  private int nmatch;
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
  public void setNwicket(int nwicket){
    this.nwicket=nwicket;
  }
  public int getNwicket(){
    return nwicket;
  }
  public void setNmatch(int nmatch){
    this.nmatch=nmatch;
  }
  public int getNmatch(){
    return nmatch;
  }
}
class BallerRepository
{
  Baller b[];
  void acceptBallers(Baller b[]){
    this.b=b;
  }
  void showDetails(){
    
  }
}
