package com.in28minutes.MultiThreadingDemo;

class Task1 extends Thread {

	public void run() { // Need to mention the exact signature

		System.out.println("\nTask1  Started");
		for (int i = 101; i <= 120; i++) {
			System.out.println(i + " ");
			System.out.println("\nTask1 Done");
		}
	}
}

class Task2 implements Runnable {
	public void run() { // Need to mention the exact signature

		System.out.println("\nTask2 Started");
		for (int i = 201; i <= 220; i++) {
			System.out.println(i + " ");
			System.out.println("\nTask2 Done");
		}
	}
}

public class ThreadBasicRunner {

	public static void main(String[] args) {

		System.out.println("\nTask1  Kicked Off");
		Task1 task1 = new Task1();
		task1.start(); /// Start method is used to start the threads.

		System.out.println("\nTask2  Kicked Off");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();

		System.out.println("\n Task3 kicked Off");

		for (int i = 301; i <= 320; i++) {
			System.out.println(i + " ");
		}

		System.out.println("\nTask3 Done");

		System.out.println("Main Task Done");

	}

}
