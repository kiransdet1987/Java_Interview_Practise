package com.in28minutes.FunctionalProgrammingDemo;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {

		List<Integer> num = List.of(1, 5, 2, 8, 9, 10);

		num.stream().forEach(element -> System.out.println(element));

		fpsum(num);

		int sum2 = num.stream().filter(nums -> nums % 2 == 1).reduce(0,
				(number1, number2) -> number1 + number2);
		System.out.println("The sum2 " + sum2);

		int sum = normalSum(num);
		System.out.println(sum);

	}

	private static int fpsum(List<Integer> num) {
		return num.stream().reduce(0, (number1, number2) -> number1 + number2);
		// System.out.println(sum1);
	}

	private static int normalSum(List<Integer> num) {
		int sum = 0;
		for (int nums : num) {
			sum += nums;
		}
		return sum;
	}

}
