package com.in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner2ArrayList {

	public static void main(String[] args) {
		
		int[] marks = {97,98,100};
		
		Student2ArrayList student2ArrayList = new Student2ArrayList("Ranga",marks);
		
		int number = student2ArrayList.getNumberOfMarks();
		System.out.println("number of marks " + number);
		
		int sum = student2ArrayList.getTotalSumOfMarks();
		System.out.println("sum of marks " + sum);
		
		int maximumMark = student2ArrayList.getMaximumMark();
		System.out.println("Maximum marks " + maximumMark);
		
		int minimumMark = student2ArrayList.getMinimumMark();
		System.out.println("Minimum  marks " + minimumMark);
		
//		BigDecimal average = student2ArrayList.getAverageMarks();
//		System.out.println("Average " + average);
		
		System.out.println(student2ArrayList);
		
		student2ArrayList.addNewMark(35);
		
		student2ArrayList.removeMarkAtIndex(2);
		
	}

}
