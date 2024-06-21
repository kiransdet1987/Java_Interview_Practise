package com.in28minutes.IntroToOOProgram;

public class MotorBike {
	
	MotorBike(){
		this(5);
	}
	
	
	
	MotorBike(int speed) {
		this.speed = speed;
	}


	private int speed;
	
	
	
	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		if(speed > 0)
		this.speed = speed;
	}



	void start() {
		System.out.println("Welcome to bikes");
	}

	
	public void increaseSpeed(int howmuch) {
		setSpeed(this.speed+howmuch);
		//this.speed = this.speed+howmuch;
	}

	
	public void decreaseSpeed(int howmuch) {
		setSpeed(this.speed-howmuch);
//		if(this.speed-howmuch>0)
//		this.speed = this.speed-howmuch;
	}

}
