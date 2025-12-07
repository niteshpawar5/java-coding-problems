import java.util.*;
class CheckPalindrome
{
  int a[];
  char ch[];
  CheckPalindrome(int a[]){
    this.a=a;
  }
  CheckPalindrome(char ch[]){
    this.ch=ch;
  }
  boolean checkIntPalim(){
    int b[]=new int[5];
    int end=a.length-1;
    boolean flag=true;
    for(int i=0;i<a.length;i++)
    b[i]=a[i];
    for(int i=0;i<a.length/2;i++){
      int t=a[i];
      a[i]=a[end];
      a[end]=t;
      end--;
    }
    for(int i=0;i<a.length;i++){
      if(a[i]!=b[i]){
        flag=false;
        break;
      }
    }
    return flag;
  }
  boolean checkCharPalim(){
    char c[]=new char[5];
    int end=ch.length-1;
    boolean flag=true;
    for(int i=0;i<ch.length;i++)
    c[i]=ch[i];
    for(int i=0;i<ch.length/2;i++){
      char t=ch[i];
      ch[i]=ch[end];
      ch[end]=t;
      end--;
    }
    for(int i=0;i<ch.length;i++){
      if(ch[i]!=c[i]){
        flag=false;
        break;
      }
    }
    return flag;
  }
}
public class CheckPalindromeApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("Enter array elements:");
    for(int i=0;i<a.length;i++)
    a[i]=sc.nextInt();
    CheckPalindrome c1=new CheckPalindrome(a);
    System.out.println(c1.checkIntPalim());
    
    char c[]=new char[5];
    System.out.println("Enter character array:");
    for(int i=0;i<c.length;i++)
    c[i]=sc.next().charAt(0);
    CheckPalindrome c2=new CheckPalindrome(c);
    System.out.println(c2.checkCharPalim());
  }
}
