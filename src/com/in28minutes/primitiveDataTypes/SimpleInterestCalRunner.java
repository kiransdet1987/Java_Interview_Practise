package com.in28minutes.primitiveDataTypes;

import java.math.BigDecimal;

public class SimpleInterestCalRunner {

	public static void main(String[] args) {
	
		SImpleInterestCalculator calculator = new SImpleInterestCalculator("4500","7.5");
		
		BigDecimal totalvalue = calculator.calculateTotalValue(5);
		
		System.out.println(totalvalue);
		
		

	}

}
