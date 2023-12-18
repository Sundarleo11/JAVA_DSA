package fundamentals;

import java.util.Scanner;

public class FahrenheittoCelsiusTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int start=sc.nextInt();
		int end=sc.nextInt();
		int step=sc.nextInt();
		
		int FahrenheitValue=start;
		while(FahrenheitValue<=end) {
			int c=(int) ((5.0/9)*(FahrenheitValue-32));
			System.out.println(FahrenheitValue +"\t"+ c);
			FahrenheitValue=FahrenheitValue+step;
		}
	}

}
