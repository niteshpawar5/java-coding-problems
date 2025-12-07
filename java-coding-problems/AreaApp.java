import java.util.*;
abstract class Area
{
  int len,wid;
  float radius;
  void setValue(int len,int wid)
  {
    this.len=len;
    this.wid=wid;
  }
  void setRadius(float radius)
  {
    this.radius=radius;
  }
  abstract double getArea();
}
class RectArea extends Area
{
  double getArea()
  {
    return len*wid;
  }
}
class CircleArea extends Area
{
  double getArea()
  {
    return 3.14*radius*radius;
  }
}
public class AreaApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    int l,w;
    float rad;
    RectArea r=new RectArea();
    System.out.print("Enter length and Width of reactangle: ");
    l=sc.nextInt();
    w=sc.nextInt();	
    r.setValue(l,w);
    System.out.println("Area of rectangle:"+(int)r.getArea());
    CircleArea c=new CircleArea();
    System.out.print("Enter radius of circle: ");
    rad=sc.nextFloat();
    c.setRadius(rad);
    System.out.println("Area of circle:"+c.getArea());
  }
}
