import java.util.*;
class CreateFirstLetterCapital
{
	char ch[];
	CreateFirstLetterCapital(char ch[])
	{
		this.ch=ch;
	}//abc mno pqr= Abc Mno Pqr
	void markFirstCapital()
	{
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && (ch[i]>='a' && ch[i]<='z'))
			ch[i]=(char)((int)ch[i]-32);
			else if(ch[i]==' ' && (ch[i+1]>='a' && ch[i+1]<='z'))
			ch[i+1]=(char)((int)ch[i+1]-32);
		}
	}
}
public class CreateFirstLetterCapitalApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		/*int size;
		System.out.println("Enter size:");
		size=sc.nextInt();*/
		char ch[];
		System.out.println("Enter characters");
		String s = sc.nextLine();
		
		/*for(int i=0;i<ch.length;i++)
		ch[i]=sc.next().charAt(0);*/
		
		ch=s.toCharArray();
		CreateFirstLetterCapital c1=new CreateFirstLetterCapital(ch);
		c1.markFirstCapital();
		System.out.println("After conversion:");
		for(int i=0;i<ch.length;i++)
		System.out.print(ch[i]);
	}
}
