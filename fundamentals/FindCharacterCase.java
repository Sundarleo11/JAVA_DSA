package fundamentals;

import java.util.Scanner;

public class FindCharacterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z') {
        	System.out.println("the character is an  lowercase alphabet : "+ ch +" : output is : 0");
        }else if((ch>='A' && ch<='Z')) {
        	System.out.println("the character is an  uppercase alphabet : "+ ch +": output is : 1");
        }else {
        	System.out.println("the character is not an alphabet : -1");
        }
	}

}
