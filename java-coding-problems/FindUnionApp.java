import java.util.*;

class FindUnion{
  int arr1[],arr2[],arr3[],count=5;
  void setArray(int arr1[],int arr2[]){
    this.arr1=arr1;
    this.arr2=arr2;
  }
  int[] findUnion(){
    arr3=new int[10];
    boolean flag=false;
    for(int i=0;i<5;i++){    
      arr3[i]=arr1[i];
      for(int j=0;j<5;j++){
        if(arr2[i]==arr1[j]){
          flag=false;
          break;
        }else{
          flag=true;
          arr3[count]=arr2[i];
        }
      }
      if(flag)
      count++;
    }
    return arr3;
  }
  int show(){
    return count;
  }
}
public class FindUnionApp{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
    FindUnion fu=new FindUnion();
    int a[]=new int[5];
    int b[]=new int[5];
    System.out.println("Enter 1'st array:");
    for(int i=0;i<5;i++)
    a[i]=sc.nextInt();
    System.out.println("Enter 2'nd array:");
    for(int i=0;i<5;i++)
    b[i]=sc.nextInt();
    fu.setArray(a,b);
    int c[]=fu.findUnion();
    System.out.println("Union of array");
    for(int i=0;i<fu.show();i++)
    System.out.printf("%d ",c[i]);
  }
}
