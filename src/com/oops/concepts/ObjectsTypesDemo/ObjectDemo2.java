package com.oops.concepts.ObjectsTypesDemo;

class Rectangle{  
	 int length;  
	 int width;  
	 void insert(int l,int w){  
	  length=l;  
	  width=w;  
	 }  
	 void calculateArea(){System.out.println(length*width);}  
	}  

public class ObjectDemo2 {

	public static void main(String[] args) {
		//creating two objects  - 
		Rectangle r1=new Rectangle(),r2=new Rectangle();
		  r1.insert(11,5);  
		  r2.insert(3,15);  
		  r1.calculateArea();  
		  r2.calculateArea();  

	}

}
