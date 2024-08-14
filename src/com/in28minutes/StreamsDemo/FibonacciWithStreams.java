package com.in28minutes.StreamsDemo;

import java.util.stream.Stream;

public class FibonacciWithStreams {

	public static void main(String[] args) {
		int n = 10; // Number of Fibonacci numbers to generate
        System.out.println("First " + n + " Fibonacci numbers:");
        fibonacciSeries(n).forEach(System.out::println);
    }


    public static Stream<Integer> fibonacciSeries(int n) {
        return Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]}).limit(n).map(fib -> fib[0]);                 
    }
}


