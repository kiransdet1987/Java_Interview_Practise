package com.in28minutes.StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RangeUsingStream {

	public static void main(String[] args) {
	
		// Sum based on values
		int[] arr = {2,5,4,7,2,9,4,5,6,1};
		List<Integer> values = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int sum = values.stream().reduce(0,(n1,n2)->n1+n2);
		System.out.println("Sum based on values "+ sum);
		
		// Sum within the range
		IntStream.range(1, 6).forEach(System.out::println); 
		
		int sum1=IntStream.range(1, 6).reduce(0,(n1,n2)->n1+n2);  // in range end value is 5 only.
		System.out.println(" Sum within the range " + sum1);
		
		// Maximum number
		List<Integer> values1 = Arrays.asList(51,4,2,5,7,4,9,21);
		int compare = values1.stream().max((n1,n2)->Integer.compare(n1, n2)).get();
		System.out.println("The compared value is "+ compare);
	}

}
