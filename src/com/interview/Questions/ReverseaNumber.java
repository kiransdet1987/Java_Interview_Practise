package com.interview.Questions;

public class ReverseaNumber {

	//Reverse a numbers and Number is Palindrome or Not.
	public static void main(String[] args) {
		int num = 12321;
		// 1. Reverse a Number Using the While Loop reversed number
		int rev = 0;
		int temp = num;
		int rem; // remainder
		while (num > 0) {
		rem = num % 10;
		rev = (rev * 10) + rem;
		num = num / 10;
		}
		System.out.println("Reversed Number is " + rev);
		// Verify number is palindrome or not
		if (rev == temp) {
		System.out.println("palindrome number ");
		} else {
		System.out.println("not palindrome");
		}

	}

}
