package com.in28minutes.abstractDemo.flightExample;

public class ChildEmirates extends ParentAircraft{

	
	
	public static void main(String[] args) {
		
		ChildEmirates ce = new ChildEmirates();
		ce.bodyColor();
		ce.enginee();
		ce.safetyGuideLines();
	}
	
	@Override
	void bodyColor() {
		System.out.println("Emirates color is red");
		
	}

}
