package com.in28minutes.arrays;

import java.util.Arrays;

public class ArraysRunner {

	public static void main(String[] args) {
	

		int[] marks = {1,2,3,4};
		System.out.println(marks.length);
		
		System.out.println(Arrays.toString(marks));
		
		Arrays.fill(marks, 10);   //- fills the entire array with 10 as bulk.
		for(int number:marks) {
			System.out.println(number);
		}
	
		
		
		int[] marks1 = {1,2,3,4,5,6,7,8};
		System.out.println(marks1.length);
		
		for(int i=0; i< marks1.length;i++) {  // use enhanced for loop
			System.out.println(marks1[i]);
		}
		
		System.out.println(Arrays.equals(marks,marks1));
		
		
		int[] marks15= {1,5,2,3,4,6,7,8};
	
		Arrays.sort(marks15);
		
		for(int number1:marks15) {
			System.out.println(number1);
		}
		
	}

}




