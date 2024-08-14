package com.interview.Questions;

public class SumOfDigits {

	public static void main(String[] args) {
		int n = 987;   //24
		int sum = 0;
		while (n != 0) {
		sum = sum + n % 10;  //remainder
		n = n / 10; // qutient
		}
		System.out.println("Using While:- " + sum);

	}

}
