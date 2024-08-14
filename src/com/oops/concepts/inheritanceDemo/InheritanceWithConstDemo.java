package com.oops.concepts.inheritanceDemo;


class Base{
	
	int x;
	Base(int _x){
		this.x=_x;
	}
}

class Derived extends Base{
	
	int y;
	
	Derived(int _x, int  _y)
	{
		super(_x);  // reusing parent constructor
		this.y=_y;
	}
	
	void display() {
		System.out.println("x= " + x + ", y=" +y);
	}
}
public class InheritanceWithConstDemo {

	public static void main(String[] args) {
		
		Derived d = new Derived(10,20);
		d.display();
	

	}

}
