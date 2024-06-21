package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student2ArrayList {

	private String name ;
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	
	
	public Student2ArrayList(String name, int... marks) {
		this.name = name;
		
		for(int mark : marks) {
			this.marks.add(mark);
		}
	}


	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum =0;
		for(int mark:marks) {
			sum+=  mark;
		}
		return sum;
	}
	
	public int getMaximumMark() {
		return Collections.max(marks);
	}

	public int getMinimumMark() {
		return Collections.min(marks);
	}
	
	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int numbers1 = getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(numbers1),3,RoundingMode.UP);
	}
	
	public String toString() {
		return name +marks;
	}


	public void addNewMark(int mark) {
		marks.add(mark);
	
		
	}


	public void removeMarkAtIndex(int index) {
		marks.remove(index);
		
	}


	


	


	
	
	
	
}
