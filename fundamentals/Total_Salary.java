package fundamentals;

import java.util.Scanner;

public class Total_Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
//		 totalSalary = basic + hra + da + allow – pf
//		where :
//		hra   = 20% of basic
//		da    = 50% of basic
//		allow = 1700 if grade = ‘A’
//		allow = 1500 if grade = ‘B’
//		allow = 1300 if grade = ‘C' or any other character
//		pf    = 11% of basic.

		Scanner sc = new Scanner(System.in);
		int basic = sc.nextInt();
		char grade = sc.next().toUpperCase().charAt(0);

		double hra = 0.20 * basic;
		double da = 0.50 * basic;
		double pf = 0.11 * basic;
		int allowance;
		if (grade == 'A') {
			allowance = 1700;

		} else if (grade == 'B') {
			allowance = 1500;
		} else {
			allowance = 1300;
		}
		
		double Amount=basic + hra + da + allowance;
		double totalSalary = Amount-pf;
		int Ans=(int) Math.round(totalSalary);
		System.out.println("Total salary: "+ Ans);

	}

}
