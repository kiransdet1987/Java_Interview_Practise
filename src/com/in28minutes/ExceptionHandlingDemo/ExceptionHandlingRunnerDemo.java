package com.in28minutes.ExceptionHandlingDemo;

public class ExceptionHandlingRunnerDemo {

	public static void main(String[] args) {
		method1();
		System.out.println("Main Ended");

	}

	private static void method1() {
		method2();
		System.out.println("Method1 ended");
	}

	private static void method2() {
		String str = null;
		str.length();
		System.out.println("Method2 Ended");
	}
}
