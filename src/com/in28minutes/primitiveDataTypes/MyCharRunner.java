package com.in28minutes.primitiveDataTypes;

public class MyCharRunner {

	public static void main(String[] args) {
	
		
		MyChar myChar = new MyChar('B');
		
		
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		
		System.out.println(myChar.isConsonant());		
		MyChar.printLowerCaseAlphabets();
     	MyChar.printUpperCaseAlphabets();
		

	}

}
