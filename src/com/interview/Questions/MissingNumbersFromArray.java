package com.interview.Questions;

import java.util.HashMap;
import java.util.Map;

public class MissingNumbersFromArray {

	public static void main(String[] args) {
		 int[] arr = {1, 3, 5, 7, 9, 8, 4};
	        int size = 9;

	        // Step 1: Create a HashMap to store the elements of the array
	        Map<Integer, Boolean> map = new HashMap<>();

	        // Step 2: Add elements to the map
	        for (int num : arr) {
	            map.put(num, true);
	        }

	        // Step 3: Find and print missing numbers
	        System.out.print("Missing numbers: ");
	        for (int i = 1; i <= size; i++) {
	            if (!map.containsKey(i)) {
	                System.out.print(i + " ");
	            }
	        }

	}

}
