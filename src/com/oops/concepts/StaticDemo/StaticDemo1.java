package com.oops.concepts.StaticDemo;


class ExampleClass1 {
	public static int count =0;
	public int id;
	
	public ExampleClass1(){
		count++;
		id = count;
	}
	
	public static void printCount() {
		System.out.println("The number of instances:- " + count);
	}
	
	public void printId() {
		System.out.println("Instance ID:" + id);
	}
	
}
public class StaticDemo1 {

	public static void main(String[] args) {
		ExampleClass1 e1 = new ExampleClass1();
		ExampleClass1 e2 = new ExampleClass1();
		ExampleClass1 e3 = new ExampleClass1();
		
		
		e1.printId();
		e2.printId();
		e3.printId();
		
		ExampleClass1.printCount();
	}

}
