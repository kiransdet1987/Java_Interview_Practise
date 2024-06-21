package com.in28minutes.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicinteger {

	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();

	public int getI() {
		return i.get();
	}

	public int getIJ() {
		return j.get();
	}

	public void incrementI() {
		i.incrementAndGet();

	}

	public void incrementJ() {

		j.incrementAndGet();

	}

}
