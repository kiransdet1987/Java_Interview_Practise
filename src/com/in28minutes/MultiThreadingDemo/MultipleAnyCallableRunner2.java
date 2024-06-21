package com.in28minutes.MultiThreadingDemo;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner2 {

	public static void main(String[] args)
			throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> tasks = List.of(new CallableTask("in28Minutes"),
				new CallableTask("ranga"), new CallableTask("happy"));

		String invokeAll = executorService.invokeAny(tasks); // It will invoke
																// only one that
																// is completed
																// execution and
																// it will
																// display

		System.out.println(invokeAll);

		executorService.shutdown();

	}

}
