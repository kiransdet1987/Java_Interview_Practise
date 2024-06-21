package com.in28minutes.arrays;

import java.math.BigDecimal;

public class Student2VarArgRunner2 {

	public static void main(String[] args) {
		
		Student2VarArg student2VarArg= new Student2VarArg("Ranga", 97,98,100);
		
		Student2VarArg student2VarArg1= new Student2VarArg("Naveen", 97);
		
		Student2VarArg student2VarArg3= new Student2VarArg("Rajesh", 97,98,100,121);
		
		int number = student2VarArg.getNumberOfMarks();
		System.out.println("number of marks " + number);
		
		int sum = student2VarArg.getTotalSumOfMarks();
		System.out.println("sum of marks " + sum);
		
		int maximumMark = student2VarArg.getMaximumMark();
		System.out.println("Maximum marks " + maximumMark);
		
		int minimumMark = student2VarArg.getMinimumMark();
		System.out.println("Minimum  marks " + minimumMark);
		
		BigDecimal average = student2VarArg.getAverageMarks();
		System.out.println("Average " + average);
		
	}

}
