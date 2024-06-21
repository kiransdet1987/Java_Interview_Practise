package com.in28minutes.FunctionalProgrammingDemo;

import java.util.List;

public class FPwithFilterRunner {

	public static void main(String[] args) {

		List<String> list = List.of("Apple", "Cat", "bat", "chat", "banana");

		List<Integer> num = List.of(1, 4, 2, 3, 6, 8, 9, 10);

		printWithBasic(list);
		printWithFuncProg(list);
		printWithFuncProgNum(num);

	}

	private static void printWithBasic(List<String> list) {
		for (String str : list) {
			if (str.endsWith("at")) {
				System.out.println("The elements are : " + str);
			}
		}
	}

	private static void printWithFuncProg(List<String> list) {
		list.stream().filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println(element));

	}

	private static void printWithFuncProgNum(List<Integer> list) {
		list.stream().filter(element -> element % 2 == 1)
				.forEach(element -> System.out.println(element));
		list.stream().filter(element -> element % 2 == 0)
				.forEach(element -> System.out.println(element));

	}
}
