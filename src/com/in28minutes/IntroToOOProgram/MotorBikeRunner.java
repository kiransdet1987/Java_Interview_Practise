package com.in28minutes.IntroToOOProgram;

public class MotorBikeRunner {

	public static void main(String[] args) {
		
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike vars = new MotorBike();  // this is default constructor.
		// TODO Auto-generated method stub
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(vars.getSpeed());
		
		
		ducati.start();
		honda.start();
		
		ducati.setSpeed(10);
		honda.setSpeed(20);
		
		
		ducati.increaseSpeed(10);
		honda.increaseSpeed(20);
	
		
//		int ducatispeed = ducati.getSpeed();
//		ducatispeed = ducatispeed+10;
//		ducati.setSpeed(ducatispeed);
//		
//		
//
//		int hondaspeed = honda.getSpeed();
//		hondaspeed = hondaspeed+10;
//		ducati.setSpeed(hondaspeed);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		
		ducati.decreaseSpeed(10);
		honda.decreaseSpeed(20);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		

	}

}
