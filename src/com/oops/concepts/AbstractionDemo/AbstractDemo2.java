package com.oops.concepts.AbstractionDemo;

abstract class A{
	// abstract method it has no body
	abstract void m1();
	
	//concrete or Non-abstract method with body.
	void m2() {
		System.out.println("This is a concrete method");
	}
}

class B extends A{

	@Override
	void m1() {
		System.out.println("B's impelementaion of m1. ");
	}
	
}

public class AbstractDemo2 {

	public static void main(String[] args) {
		A b = new B();
		b.m1();
		b.m2();
		
		B b1 = new B();
		b1.m1();
		b1.m2();

	}

}
