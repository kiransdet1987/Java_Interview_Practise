package com.interview.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompareLengtharrayAndPosition {

	//Compare 2 arrays and check whether their length is not equal, then
	//do check the position on which elements are present based on max length of array.
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4};
	    int[] arr2 = {1, 2, 5, 6};

	    
	    // Compare lengths
	    if (arr1.length != arr2.length) {
	      System.out.println("Arrays have different lengths.");
	    } else {
	      // Loop through the shorter array (to avoid out-of-bounds issues)
	    	// Below loop is to find the min length and loop it based on min length to print the values at that position.
	      int maxLength = Math.min(arr1.length, arr2.length);
	      for (int i = 0; i < maxLength; i++) {
	        System.out.println("Element at index " + i + ":");
	        System.out.println("  arr1: " + arr1[i]);
	        if (i < arr2.length) {
	          System.out.println("  arr2: " + arr2[i]);
	        } else {
	          System.out.println("  arr2 (out of bounds): N/A");
	        }	
	      }
	    }
	    List<Integer> list1 =Arrays.stream(arr1).boxed().collect(Collectors.toList());
		List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
		// To display the common elements.
    	List<Integer> commonElements1 = 
				list1.stream().filter(list2::contains).collect(Collectors.toList());
				System.out.println("The common elements are :-" + commonElements1);
				
				//To show distinct elements
				Stream<Integer> commonElements2 = Stream.concat(list1.stream(), list2.stream());
			 			//commonElements2.distinct().collect(Collectors.toList()).forEach(System.out::print);
			 			List<Integer> commonElements3 = commonElements2.distinct().collect(Collectors.toList());
			 			System.out.println("The distinct elements are :-" + commonElements3);
	}
}


//Element at index 0:
//	  arr1: 1
//	  arr2: 1
//	Element at index 1:
//	  arr1: 2
//	  arr2: 2
//	Element at index 2:
//	  arr1: 3
//	  arr2: 5
//	Element at index 3:
//	  arr1: 4
//	  arr2: 6

