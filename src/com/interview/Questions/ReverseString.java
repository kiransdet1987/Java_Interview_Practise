package com.interview.Questions;

public class ReverseString {

	public static void main(String[] args) {
		String str = "mama";
		String s2 = "";
		// 1. by using the charAt() method
		for (int i = str.length() - 1; i >= 0; i--) {
		s2 = s2 + str.charAt(i);// extracts each character and store in string
		}
		System.out.println("Reversed word: " + s2);
		
		// below is code to check weather given string is Palindrome or not
		if (str.equalsIgnoreCase(s2)) {
		System.out.println("String is Palindrome");
		} else {
		System.out.println("String is not Palindrome");
		}
		
		
	// 2. Using built in reverse() method of the StringBuilder class:
		String input = "Welcome To Jave Learning";
		StringBuilder input1 = new StringBuilder();
		input1.append(input); // append a string into StringBuilder input1
		input1.reverse();
		System.out.println(input1);
	
		// 3. Using StringBuffer:
		String strText = "Java Learning";
		// conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer(strText);
		sbr.reverse();
		System.out.println(sbr);

}

}


