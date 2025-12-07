import java.io.*;

public class FileWrite{
	public static void main(String[] args) {
		// File wr=new File("/home/bhushan/Desktop/abc.txt");
		File f[]=File.listRoots();
		for(int i=0;i<f.length;i++){
			long a=f[i].getTotalSpace()/1073741824;
			long b=f[i].getFreeSpace()/1073741824;
			System.out.println(a+"gb "+b+"gb");			
		}
	}
}