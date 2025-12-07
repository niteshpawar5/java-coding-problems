import java.io.*;

public class FileWrite1{
	public static void main(String[] args)throws IOException {
		// File wr=new File("/home/bhushan/Desktop/MNO");
		// boolean a=wr.exists();
		// if(a)
		// 	System.out.println("Folder already present");
		// else{
		// 	System.out.println("Folder not present");
		// 	boolean b=wr.mkdir();
		// 	if(b)
		// 		System.out.println("Folder created");
		// 	else
		// 		System.out.println("Folder not created");
		// }


		// File mn=new File("/home/bhushan/Desktop/");
		// File list[]=mn.listFiles();
		// for(int i=0;i<list.length;i++)
		// 	System.out.println(list[i]);
		
		File f1=new File("/home/bhushan/Desktop/MNO/abc.txt");
		f1.createNewFile();
	}
}