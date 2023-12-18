package fundamentals;

import java.util.Scanner;

public class Sum_of_Even_Digit_Sum_of_Odd_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int size = String.valueOf(num).length(); // finding size for given number
		int sum_even = 0;
		int sum_odd = 0;

		for (int i = 0; i < size; i++) {

			int last = num % 10;

			if (last % 2 == 0) {

				sum_even = sum_even + last;
			} else {
				sum_odd = sum_odd + last;
			}
			num = num / 10;
		}
		System.out.println(sum_even + " " + sum_odd);

	}

}
