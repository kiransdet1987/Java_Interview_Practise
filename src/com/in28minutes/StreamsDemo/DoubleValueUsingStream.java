package com.in28minutes.StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleValueUsingStream {

	public static void main(String[] args) {
		int[] arr = {1,3,5};
		List<Integer> values = Arrays.stream(arr).boxed().collect(Collectors.toList());
		values.stream().map(s->s*s).forEach(System.out::println);

	}

}
