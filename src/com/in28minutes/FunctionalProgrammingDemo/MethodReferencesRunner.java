package com.in28minutes.FunctionalProgrammingDemo;

import java.util.List;

public class MethodReferencesRunner {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static void main(String[] args) {

		List<String> list = List.of("Ant", "bat", "cat", "Dog", "Elephant");

		list.stream().map(s -> s.length()).forEach(s -> System.out.println(s));

		list.stream().map(String::length)
				.forEach(MethodReferencesRunner::print);

		Integer max = List.of(23, 45, 67, 34).stream().filter(n -> n % 2 == 0)
				.max((n1, n2) -> Integer.compare(n1, n2)).orElse(0);
		System.out.println(max);

		Integer max2 = List.of(23, 45, 67, 34).stream()
				.filter(MethodReferencesRunner::isEven).max(Integer::compare)
				.orElse(0);
		System.out.println(max2);
	}

	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

}
