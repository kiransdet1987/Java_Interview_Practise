package com.in28minutes.MultiThreadingDemo;

class Task11 extends Thread {

	public void run() { // Need to mention the exact signature

		System.out.println("\nTask1 1 Started");
		for (int i = 101; i <= 120; i++) {
			System.out.println(i + " ");
			System.out.println("\nTask11Done");
		}
	}
}

class Task22 implements Runnable {
	public void run() { // Need to mention the exact signature

		System.out.println("\nTask22 Started");
		for (int i = 201; i <= 220; i++) {
			System.out.println(i + " ");
			System.out.println("\nTask22 Done");
		}
	}
}

public class ThreadJoinsDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("\nTask11  Kicked Off");
		Task11 task11 = new Task11();
		task11.start(); /// Start method is used to start the threads.

		System.out.println("\nTask22  Kicked Off");
		Task22 task22 = new Task22();
		Thread task22Thread = new Thread(task22);
		task22Thread.start();

		task11.join(); // Joins are used to continue the execution only after
						// current tasks are completed like task11 and task22.
						// after that
						// only it will execute task3
		task22Thread.join();

		System.out.println("\n Task33 kicked Off");

		for (int i = 301; i <= 320; i++) {
			System.out.println(i + " ");
		}

		System.out.println("\nTask33 Done");

		System.out.println("Main Task Done");

	}

}
