package com.in28minutes.conditionsIfandSwitch;

public class IfStatementRunner {

	public static void main(String[] args) {
		
		
		int i=27;
		
		if(i==25) {
			System.out.println("i=25");
			
		}else if (i==24) {
			System.out.println("i=24");
		}else {
			System.out.println("i !=24 and i !=25");
		}
		
		
		puzzle1();
		puzzle2();
		puzzle3();
		puzzle4();


	}
	
	private static void puzzle1() {
		
		int k=15;
		
		if(k>20) {
			System.out.println(1);
		} else if (k >10) {
			System.out.println(2);
		}else if (k < 20) {
			System.out.println(3);
		}else {
			System.out.println(4);
		}
	}

	
private static void puzzle2() {
		
		int l=15;
		
		if(l<20) 
			System.out.println("l<20");
		
		if (l >20) 
			System.out.println("l>20");
		else 
			System.out.println("who am I?");
		
	}

private static void puzzle3() {
	// This code won't execute any thing.
	int m=15;
	  
	if(m > 20) 
	if(m < 20) 
		System.out.println("m>20");
	else 
		System.out.println("who am m?");
	
}

private static void puzzle4() {
	// This code won't execute any thing.
	int number=5;
	  
	if(number < 0) 
		number =number + 10;
	number++;
	System.out.println(number);
	
}



}
