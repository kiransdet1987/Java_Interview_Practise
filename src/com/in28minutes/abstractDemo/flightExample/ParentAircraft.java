package com.in28minutes.abstractDemo.flightExample;

public abstract class ParentAircraft {
	
	void enginee() {
		System.out.println("Follow Enginee GuideLines");
	}
	
	void safetyGuideLines() {
		System.out.println("follow safety guidelines");
	}
	
	

	abstract void bodyColor();
}
