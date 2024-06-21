package com.in28minutes.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {

	private int i = 0;
	private int j = 0;

	public int getI() {
		return i;
	}

	public int getIJ() {
		return j;
	}

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	public void incrementI() {
		lockForI.lock();// Get Lock for I
		i++;
		lockForI.unlock();// Release Lock for I

	}

	public void incrementJ() {

		lockForI.lock();// Get Lock for J
		j++;
		lockForI.unlock();// Release Lock for J

	}

}
