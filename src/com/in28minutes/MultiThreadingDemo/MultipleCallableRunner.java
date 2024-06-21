package com.in28minutes.MultiThreadingDemo;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args)
			throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(1);

		List<CallableTask> tasks = List.of(new CallableTask("in28Minutes"),
				new CallableTask("ranga"), new CallableTask("happy"));

		List<Future<String>> invokeAll = executorService.invokeAll(tasks);

		for (Future<String> result : invokeAll) {
			System.out.println(result.get());
		}

		executorService.shutdown();

	}

}
