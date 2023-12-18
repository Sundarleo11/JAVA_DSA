package fundamentals;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int div=2;
		boolean isprime=true;
		while(div<num/2) {
			if(num%div==0) {
				isprime=false;
			}
			div++;
		}
		if(isprime) {
			System.out.println("prime number");
		}else {
			System.out.println("not prime number");
		}

	}

}
