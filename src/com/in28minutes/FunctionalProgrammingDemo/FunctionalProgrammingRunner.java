package com.in28minutes.FunctionalProgrammingDemo;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {

		List<String> list = List.of("Apple", "Banana", "Graphes");

		printBasic(list);
		printBasicWithFuncProg(list);

		List<Integer> number = List.of(1, 5, 2, 8, 21, 14);

		printBasicWithFuncProgNum(number);

	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println("The list is " + string);
		}
	}

	private static void printBasicWithFuncProg(List<String> list) {
		list.stream().forEach(
				element -> System.out.println("The element  " + element));
	}

	private static void printBasicWithFuncProgNum(List<Integer> list) {
		list.stream().forEach(
				element -> System.out.println("The numbers  " + element));
	}

}
