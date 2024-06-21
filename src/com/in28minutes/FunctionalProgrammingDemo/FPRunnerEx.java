package com.in28minutes.FunctionalProgrammingDemo;

import java.util.List;
import java.util.stream.IntStream;

public class FPRunnerEx {

	public static void main(String[] args) {

		// List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);

		// Print square of first 10 numbers
		IntStream.range(1, 11).map(e -> e * e)
				.forEach(p -> System.out.println(p));

		List<String> numbers1 = List.of("Apple", "Bat", "Cat");

		numbers1.stream().map(s -> s.toLowerCase())
				.forEach(p -> System.out.println(p));

		numbers1.stream().map(s -> s.length())
				.forEach(p -> System.out.println(p));
	}

}
