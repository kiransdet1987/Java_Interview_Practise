package com.in28minutes.interfaceDemo.Trafficexample;

public class AustralianTrafic implements CentralTraffic,ContinentTraffic{

	public static void main(String[] args) {
		
		CentralTraffic ct = new AustralianTrafic();
		ct.flashYellow();
		ct.redStop();
		ct.greenGo();
		
		AustralianTrafic at = new AustralianTrafic();
		at.organgeGo();
		at.walkOnSymbol();
		
		 ContinentTraffic cts =new AustralianTrafic();
		 cts.trainSymbol();
	}

	@Override
	public void greenGo() {
		System.out.println("Go green " +i);
		
	}

	@Override
	public void redStop() {
		System.out.println("Red Stop");
		
	}

	@Override
	public void flashYellow() {
		System.out.println("Flash yellow");
		
	}


	public void walkOnSymbol() {
		System.out.println("walk on symbol Goes");
		
	}

	public void organgeGo() {
		System.out.println("Orange Goes");
		
	}

	@Override
	public void trainSymbol() {
	System.out.println("Train will go");
		
	}
}
