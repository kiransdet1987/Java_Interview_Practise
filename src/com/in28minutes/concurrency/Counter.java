package com.in28minutes.concurrency;

public class Counter {

	private int i = 0;

	synchronized public void increment() {
		i++;

		// i will do 3 things get i, increment, set i. If we run this on 2
		// threads some times it will miss
		// the increment that is the reason we need to use synchronized
	}

	public int getI() {
		return i;
	}

}
