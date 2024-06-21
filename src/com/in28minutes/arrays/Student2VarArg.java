package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student2VarArg {

	private String name ;
	private int[] marks;
	
	
	public Student2VarArg(String name, int... marks) {  // to pass variable arguments and we can mention this as last argument.
		this.name = name;
		this.marks = marks;
	}


	public int getNumberOfMarks() {
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		int sum =0;
		for(int mark:marks) {
			sum+=  mark;
		}
		return sum;
	}
	
	public int getMaximumMark() {
	int maximum = Integer.MIN_VALUE;   //95,98,10
	for(int mark:marks) {
		if(mark>maximum) {
			maximum=mark;
		}
	}
		return maximum;
	}

	public int getMinimumMark() {
		int minimum = Integer.MAX_VALUE;   //95,98,10
		for(int mark:marks) {
			if(mark<minimum) {
				minimum=mark;
			}
		}
			return minimum;
	}
	
	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int numbers1 = getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(numbers1),3,RoundingMode.UP);
	}


	


	


	
	
	
	
}
