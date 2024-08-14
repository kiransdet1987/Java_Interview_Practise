package com.oops.concepts.encapsulationDemo;


class Area{
	
	private int length;
	private int breadth;
	
	public Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public Area() {
		// TODO Auto-generated constructor stub
	}

	public void  getArea() {
		int area = length * breadth;
		System.out.println("The area is :- "+ area);
	}
	
	public int  getPerimeter(int length) {
		return(4*length);  
		/*
		 * int perimeter = 4*length; 
		 * return perimeter;
		 */
		  
	}
	
}

public class EncapsulationDemo2 {

	public static void main(String[] args) {
	
		Area rectange = new Area(2,4);
		rectange.getArea();
		
		Area perimeters = new Area();
		int perimeterValue =perimeters.getPerimeter(4);
		
		System.out.println("The perimeter is :- "+ perimeterValue);
	}

}
