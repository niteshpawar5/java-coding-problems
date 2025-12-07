import java.util.*;

class MergeArray{
	int first[],second[];
	int third[]=new int[10];
	void acceptArray(int first[],int second[]){
		this.first=first;
		this.second=second;
	}
	void performMerge(){
		for(int i=0;i<5;i++)
		third[i]=first[i];
		for(int i=5;i<10;i++)
		third[i]=second[i-5];
	}
	int [] getMergedArray(){
		return third;
	}
}
public class MergeArrayApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		MergeArray ma=new MergeArray();
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("Enter elements in first array:");
		for(int i=0;i<5;i++)
		a[i]=sc.nextInt();
		System.out.println("Enter elements in second array:");
		for(int i=0;i<5;i++)
		b[i]=sc.nextInt();
		ma.acceptArray(a,b);
		ma.performMerge();
		int c[]=ma.getMergedArray();
		for(int i=0;i<10;i++)
		System.out.printf("%d ",c[i]);
	}
}