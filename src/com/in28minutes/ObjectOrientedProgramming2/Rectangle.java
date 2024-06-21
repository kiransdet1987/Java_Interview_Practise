package com.in28minutes.ObjectOrientedProgramming2;

public class Rectangle {
	
	private int length;
	
	private int width;

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
	public int area() {
		return getLength() * getWidth();
		
	}
	
	public int perimeter() {
		return 2 * (getLength() + getWidth());
		
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", getLength()=" + getLength() + ", getWidth()="
				+ getWidth() + ", area()=" + area() + ", perimeter()=" + perimeter() + "]";
	}
	
	
	

	

	

}
