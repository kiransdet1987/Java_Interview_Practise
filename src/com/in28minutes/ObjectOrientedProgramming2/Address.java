package com.in28minutes.ObjectOrientedProgramming2;

public class Address {
	
	private String line1;
	private String city;
	private String  zip;
	
	//creations
	public Address(String line1, String city, String zip) {
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", city=" + city + ", zip=" + zip + "]";
	}
	

	
	
	

}
