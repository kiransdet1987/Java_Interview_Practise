package com.in28minutes.StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintUniqueandSortUsingStreams {

	public static void main(String[] args) {
		int[] arr = {2,5,4,7,2,9,4,5,6,1};
		List<Integer> values = Arrays.stream(arr).boxed().collect(Collectors.toList());
				  
		
		
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		List<Integer> newValues = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(newValues.get(2));

	}

}
