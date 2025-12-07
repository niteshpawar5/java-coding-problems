import java.util.*;
class ArrayComp
{
  int a[],b[];
  char c[],ch[];
  ArrayComp(int a[],int b[])
  {
    this.a=a;
    this.b=b;
  }
  ArrayComp(char c[],char ch[])
  {
    this.c=c;
    this.ch=ch;
  }
  boolean isIntArrayComp()
  {
    boolean flag=true;
    for(int i=0;i<a.length;i++){
      if(a[i]!=b[i]){
        flag=false;
        break;
      }
    }
    return flag;
  }
  boolean isCharArrayComp()
  {
    boolean flag=true;
    for(int i=0;i<c.length;i++){
      if(c[i]!=ch[i]){
        flag=false;
        break;
      }
    }
    return flag;
  }
}
public class ArrayCompApp
{
  public static void main(String x[])
  {
    int a[]=new int[5];
    int b[]=new int[5];
    char c[]=new char[5];
    char ch[]=new char[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter elements in 1st array:");
    for(int i=0;i<a.length;i++)
    a[i]=sc.nextInt();
    System.out.println("Enter elements in 2nd array:");
    for(int i=0;i<b.length;i++)
    b[i]=sc.nextInt();
    ArrayComp a1=new ArrayComp(a,b);
    System.out.println(a1.isIntArrayComp());
    
    System.out.println("Enter characters in 1st array:");
    for(int i=0;i<c.length;i++)
    c[i]=sc.next().charAt(0);
    System.out.println("Enter characters in 2nd array:");
    for(int i=0;i<ch.length;i++)
    ch[i]=sc.next().charAt(0);
    ArrayComp a2=new ArrayComp(c,ch);
    System.out.println(a2.isCharArrayComp());
  }
}
