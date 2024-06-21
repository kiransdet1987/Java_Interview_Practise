package com.in28minutes.concurrency;

public class BiCounter {

	private int i = 0;
	private int j = 0;

	public int getI() {
		return i;
	}

	public int getIJ() {
		return j;
	}
	synchronized public void incrementI() {
		i++;

		// i will do 3 things get i, increment, set i. If we run this on 2
		// threads some times it will miss
		// the increment that is the reason we need to use synchronized
	}

	synchronized public void incrementJ() {
		j++;

		// i will do 3 things get i, increment, set i. If we run this on 2
		// threads some times it will miss
		// the increment that is the reason we need to use synchronized
	}

}
