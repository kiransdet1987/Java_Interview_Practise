package com.oops.concepts.ObjectsTypesDemo;

class Calculator{
	
	void fact(int  n){  
		  int fact=1;  
		  for(int i=1;i<=n;i++){  
		   fact=fact*i;  
		  }  
		 System.out.println("factorial is "+fact);  
	
}
}

public class ObjectDemo1 {

	public static void main(String[] args) {
		
		// Anonymous object which has no reference. Used only for one time purpose, then create it.
		new Calculator().fact(5);

	}

}
