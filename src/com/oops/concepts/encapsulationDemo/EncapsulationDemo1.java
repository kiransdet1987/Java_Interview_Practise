package com.oops.concepts.encapsulationDemo;



class Person{
	
	private int age;
	private String name;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}


public class EncapsulationDemo1 {

	public static void main(String[] args) {

		Person person = new Person();
		person.setName("kiran");
		person.setAge(21);
		
		System.out.println("The person name is :- " + person.getName());
		System.out.println("The age is :- " + person.getAge());
		 
		

	}

}
