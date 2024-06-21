package com.in28minutes.IntroToOOProgram;

public class Book {
	
	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	int noOfCopies;

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if(noOfCopies>0)
		this.noOfCopies = noOfCopies;
	}
	
	public void increaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies+howMuch);
	}
	
	public void decreaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies-howMuch);
	}

}
