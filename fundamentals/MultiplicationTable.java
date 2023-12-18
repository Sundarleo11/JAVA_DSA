package fundamentals;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int size=10; // first 10 number
		
		for(int i=1;i<=size;i++) {
			int j=i*n;
		  System.out.println(j);
		}

	}

}
