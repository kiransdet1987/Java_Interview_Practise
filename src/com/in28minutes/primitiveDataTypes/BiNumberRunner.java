package com.in28minutes.primitiveDataTypes;

public class BiNumberRunner {

	public static void main(String[] args) {
		
		BiNumbers number = new BiNumbers(2,3);
		
		number.doubleValue();
		
		System.out.println(number.add());
		System.out.println(number.multiply());
		
		
		System.out.println(number.getNumber1());
		System.out.println(number.getNumber2());
	}

}
