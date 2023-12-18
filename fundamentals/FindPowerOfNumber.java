package fundamentals;

import java.util.Scanner;

public class FindPowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int ans=1;
		for(int i=1;i<=num2;i++) {
			ans=ans*num1;
		}
		System.out.println(ans);

	}

}
