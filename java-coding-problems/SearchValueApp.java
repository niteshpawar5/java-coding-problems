import java.util.*;

class SearchValue{
  int a[],value;
  void setArray(int a[],int value){
    this.a=a;
    this.value=value;
  }
  boolean searchValue(){
    boolean check=false;
    for(int i=0;i<a.length;i++){
      if(a[i]==value){
        check=true;
        break;
      }
    }
    return check;
  }
}
public class SearchValueApp{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
    SearchValue sv=new SearchValue();
    int a[]=new int[5];
    int value;
    System.out.println("Enter array elements:");
    for(int i=0;i<5;i++)
    a[i]=sc.nextInt();
    System.out.println("Enter value to search");
    value=sc.nextInt();
    sv.setArray(a,value);
    System.out.println(sv.searchValue());
  } 
}
