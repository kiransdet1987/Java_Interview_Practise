package com.interview.Questions;

public class CountDigitsinIntegerNumber {
	
	public static void main(String[] args) {
	long num = 298;
	int count = 0;

	// 1. by using while loop
	while (num != 0) {
	num = num / 10;
	count++;
	}
	System.out.println("Number of digits : " + count);
	// 2. Converting given number to string solution to count digits in an integer
	
	int num2 = 298453;
	String result = Integer.toString(num2); // calculate the size of string
	System.out.println(+result.length());

}
}
