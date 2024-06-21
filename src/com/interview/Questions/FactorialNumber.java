package com.interview.Questions;

import java.util.Scanner;

public class FactorialNumber {
	
	/*
	 * Input = 5! 
	 * Output = 5! = 5*4*3*2*1 = 120
	 */
			

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number which you want for Factorial: ");
		int num = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) 
		{
		fact = fact * i; 
		}
		System.out.println("Factorial of" + num + " is " + fact);

	}

}
