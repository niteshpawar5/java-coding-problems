// 2  5
// 8  9  10
// 4  7  3  1
// 3  11

import java.util.*;

public class Jagged{
	public static void main(String x[]){
		Scanner s=new Scanner(System.in);
		int a[][]=new int[4][];
		a[0]=new int[2];
		a[1]=new int[3];
		a[2]=new int[4];
		a[3]=new int[2];
		System.out.println("Input:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Output:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("\n");
		}
	}
}