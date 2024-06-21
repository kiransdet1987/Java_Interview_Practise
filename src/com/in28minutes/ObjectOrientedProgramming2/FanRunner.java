package com.in28minutes.ObjectOrientedProgramming2;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new  Fan("Manufacture 1",0.34567,"GREEN");
		
		//fan.isOn(false);
		fan.switchOn();
		fan.setSpeed((byte)5);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
		
	}

}
