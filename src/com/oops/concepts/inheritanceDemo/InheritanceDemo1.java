package com.oops.concepts.inheritanceDemo;

class Base{
	
	Base(){
		System.out.println("Base class constructor called");
	}
}

class Derived extends Base{
	
	Derived(){
		System.out.println("Derived class Constructor called");
	}
}

public class InheritanceDemo1 {

	public static void main(String[] args) {

		Derived d = new Derived();
		// Note: Here first super class constructor will be
        // called there after derived(sub class) constructor
        // will be called

	}

}
