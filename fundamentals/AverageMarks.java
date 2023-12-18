package fundamentals;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Sample Input 1 :
//			A
//			3 4 6
//			Sample Output 1 :
//			A
//			4
//			Sample Input 2 :
//			T
//			7 3 8
//			Sample Output 2 :
//			T
//			6
     
	
		Scanner sc=new Scanner(System.in);
		
		char name=sc.next().charAt(0);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		int avg=(num1+num2+num3)/3;
		
		System.out.println(name);
		System.out.println(avg);
		
		
	}

}
