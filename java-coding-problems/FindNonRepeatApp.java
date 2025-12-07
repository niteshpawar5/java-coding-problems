import java.util.*;

class FindNonRepeat
{
  int arr[];
  FindNonRepeat(int arr[])
  {
    this.arr=arr;
  }
  void showNonRepeat()
  {
    for(int i=0;i<arr.length;i++)
    {
      int count=0;
      for(int j=0;j<arr.length;j++)
      {
        if(arr[i]==arr[j])
        count++;
      }
      if(count==1)
      System.out.print(arr[i]+" ");
    }
  }
}
class FindNonRepeatApp
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    int arr[],size;
    System.out.println("Enter size of array:");
    size=sc.nextInt();
    arr=new int[size];
    System.out.println("Enter elements of array:");
    for(int i=0;i<arr.length;i++)
    arr[i]=sc.nextInt();
    FindNonRepeat fn=new FindNonRepeat(arr);
    System.out.println("Non repeat elements of array:");
    fn.showNonRepeat();
  }
}
