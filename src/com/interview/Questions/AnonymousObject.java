package com.interview.Questions;

class Factorial{
	void fact(int  n){  
		  int fact=1;  
		  for(int i=1;i<=n;i++){  
		   fact=fact*i;  
		  }  
		 System.out.println("factorial is "+fact);  
}
}

public class AnonymousObject {

	public static void main(String[] args) {
	new Factorial().fact(5);
	}

}
