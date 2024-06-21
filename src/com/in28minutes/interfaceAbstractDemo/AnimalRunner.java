package com.in28minutes.interfaceAbstractDemo;

abstract class Animal{
	abstract void bark();
	
}

class dog extends Animal{
	public void bark() {
		System.out.println("Bow Bow");
	}
}

class cat extends Animal{
	public void bark() {
		System.out.println("Meow meow");
	}
}


public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animals = {new cat(), new dog()};
		for(Animal animal:animals) {
			animal.bark();
		}

	}

}
