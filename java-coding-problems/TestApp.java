class Test
{
   int arr[];
   void setValue(int x[])
   { arr=x;
   }
   void test()
   { arr[1]=100;
   }
}
public class TestApp
{
   public static void main(String x[])
   {  int a[]=new int[]{10,20,30,40,50};
      Test t = new Test();
        t.setValue(a);
        t.test();
   System.out.println("Display array");
     for(int i=0; i<a.length;i++)
     { System.out.printf("%d\t",a[i]);
     }
   }
}