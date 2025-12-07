class A{
  A(int x)
  {
    System.out.println(x);
  }
}
class B extends A{
  B(int x,int y)
  {
    super(x);
    System.out.println(x+" "+y);
  }
}
public class ParentApp{
  public static void main(String x[])
  {
    B b=new B(500,400);
  }
}
