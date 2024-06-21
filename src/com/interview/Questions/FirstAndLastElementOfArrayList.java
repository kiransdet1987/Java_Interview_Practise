package com.interview.Questions;

public class FirstAndLastElementOfArrayList {
	/*
	 * Input = array1 = { 4, 2, 3, 1, 6 }; 
	 * Output = First is:4, Last is: 6
	 */
	public static void main(String[] args) {

		int[] numbers = {1, 2, 3, 4, 5};
		
		if (numbers.length<=0) {
			  System.out.println("List is empty!");
			} else {
		// Accessing first element: numbers[0] (index 0)
		int firstElement = numbers[0];

		// Accessing last element: numbers[length - 1]
		int lastElement = numbers[numbers.length - 1];

		System.out.println("First element: " + firstElement);
		System.out.println("Last element: " + lastElement);
			}
	}

}
