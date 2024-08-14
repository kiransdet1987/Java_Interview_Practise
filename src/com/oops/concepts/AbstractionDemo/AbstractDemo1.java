package com.oops.concepts.AbstractionDemo;

abstract class grg{
	abstract void printInfo();
}

class employee extends grg{

	@Override
	void printInfo() {
		String name = "aakanksha";
        int age = 21;
        float salary = 55552.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
		
	}
	
}

public class AbstractDemo1 {

	public static void main(String[] args) {
		
		employee s =  new employee();
		s.printInfo();
		
		
		grg s1 =  new employee();
		s1.printInfo();

	}

}
