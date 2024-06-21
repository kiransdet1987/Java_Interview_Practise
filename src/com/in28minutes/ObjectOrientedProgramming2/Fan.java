package com.in28minutes.ObjectOrientedProgramming2;

public class Fan {
	
	
	//State
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;  //1 to 5
	
	
	//Creation
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}
	
	
	//isOn
	
	public void isOn(boolean isOn) {
		this.isOn = isOn;
	}
	
	public void switchOn() {
		this.isOn = true;
		setSpeed((byte)5);
	}
	
	public void switchOff() {
		this.isOn = false;
		setSpeed((byte)0);
	}
	
	public void setSpeed(byte speed) {
		this.speed = speed;
	}
	
	
	// print the state
	public String toString() {
		return "Fan [make=" + make + ", radius=" + radius + ", color=" + color + ", isOn=" + isOn + ", speed=" + speed
				+ "]";
	}

}
