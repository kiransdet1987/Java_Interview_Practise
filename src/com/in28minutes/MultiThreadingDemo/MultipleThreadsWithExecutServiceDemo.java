package com.in28minutes.MultiThreadingDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleThreadsWithExecutServiceDemo {

	public static void main(String[] args) {
		// ExecutorService executorService =
		// Executors.newSingleThreadExecutor();

		ExecutorService executorService = Executors.newFixedThreadPool(2); // Only
																			// 2
																			// threads
																			// are
																			// executed
																			// parallely.

		executorService.execute(new Task11());

		executorService.execute(new Thread(new Task22()));

		System.out.println("\n Task33 kicked Off");

		for (int i = 301; i <= 320; i++) {
			System.out.println(i + " ");
		}

		System.out.println("\nTask33 Done");

		System.out.println("Main Task Done");

		executorService.shutdown();
	}

}
