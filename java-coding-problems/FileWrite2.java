import java.util.*;
import java.io.*;

public class FileWrite2{
	public static void main(String[] args) throws IOException{
		FileWriter f1=new FileWriter("/home/bhushan/Desktop/MNO/abc.txt");
		BufferedWriter bw=new BufferedWriter(f1);
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		bw.write(s);
		bw.close();
	}
}