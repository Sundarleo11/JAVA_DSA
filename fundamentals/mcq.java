package fundamentals;

public class mcq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=5;
        if(a<6) {
        	System.out.println("Hello");
        }else if(a==5) {
        	System.out.println("hi");
        }else {
        	System.out.println("Else block");
        }
        
        int a1=5,b=6;
        if((b=1)==a1) {
        	System.out.println("if block:"+b);
        }
        else { 
        	System.out.println("else block :"+b+1);
        }
        
        /*int a2=50;
        int b2=Integer.MIN_VALUE;
        if(b2/0==a2) {
        	System.out.println("If block :");
        }else {
        	System.out.println("else block:");
        }*/
        
        int a3=50,b3=20;
 
        if(a3>b3) {
        	if(a>100)
        		System.out.println("Ace");
        	if(a>100)
        	  b3=50;
        }else if(a3==b3) {
        	System.out.println("king");
        }else {
        	System.out.println("queen");
        }
        
        
        int a4=10, b4=8;
        if(a4>b4) {
        	System.out.println("first num is greater");
        }if(a4<b4) {
        	System.out.println("second num is greater");
        }else {
        	System.out.println("Both are equal");
        }
      //if else if
        int a5=10, b5=8;
        if(a5>b5) {
        	System.out.println("first num is greater");
        }else if(a5<b5) {
        	System.out.println("second num is greater");
        }else {
        	System.out.println("Both are equal");
        }
        
        
        //scope of variable
        
        int i=1;
        int j=10;
        while(i<=5) {
        	j=10;
        	System.out.println(i);
        	i++;
        	j++;
        }
        System.out.println(i);
        System.out.println(j);
        
        int a6=15;
        if(a6>10) {
        	 a6=100;
        }
        System.out.println(a6);
        
	}

}
