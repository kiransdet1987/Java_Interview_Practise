package com.in28minutes.Inheritance;

public class Student extends Person {

	public Student(String name, String collegeName) {
		super(name);
		this.collegeName = collegeName;
	}
	
	private String collegeName;
	private int year;
	
	public String getCollege() {
		return collegeName;
	}
	public void setCollege(String college) {
		this.collegeName = college;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
