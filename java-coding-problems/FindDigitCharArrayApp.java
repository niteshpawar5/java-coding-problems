import java.util.*;

class FindDigitCharArray
{
	char ch[];
	FindDigitCharArray(char ch[]){
		this.ch=ch;
	}
	int findDigitSum(){
		int sum=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]>='0' && ch[i]<='9')
			sum=sum+(int)ch[i]-48;
		}
		return sum;
	}
}
public class FindDigitCharArrayApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter size:");
		size=sc.nextInt();
		char ch[]=new char[size];
		System.out.println("Enter characters:");
		for(int i=0;i<ch.length;i++)
		ch[i]=sc.next().charAt(0);
		FindDigitCharArray fd=new FindDigitCharArray(ch);
		System.out.println("Sum of digits: "+fd.findDigitSum());
	}
}
