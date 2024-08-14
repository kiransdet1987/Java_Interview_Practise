package com.in28minutes.StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenNumUsingStream {

	public static void main(String[] args) {
		int[] arr = {21,44,22,54,17};
		List<Integer> values = Arrays.stream(arr).boxed().collect(Collectors.toList());
		values.stream().filter(s->s%2==0).forEach(System.out::println);
		
		int[] arr1 = {21,17,19,27};
		List<Integer> values1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
		
		int rev = values1.stream().filter(s->s%2==0).max((n1,n2)->Integer.compare(n1,n2)).orElse(0);
		System.out.println(rev);
	}

}
