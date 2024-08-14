package com.oops.concepts.AbstractionDemo;

/*In Java, we can have an abstract class without any abstract method. This allows us to create classes that cannot 
be instantiated but can only be inherited. It is as shown below as follows with help of a clean java program.
*/

/*it can have final methods*/

//we can define static methods in an abstract class that can be called independently without an object. 

abstract class Base {
	 
    // Demo method. This is not an abstract method.
    void fun()
    {
        System.out.println("Function of Base class is called");
    }
    
    final void funs()
    {
        System.out.println("Base fun()s called");
    }
    
    static void demofun()
    {
 
        // Print statement
        System.out.println("Geeks for Geeks");
    }
}
 
// Class 2
class Derived extends Base {
    // This class only inherits the Base class methods and
    // properties
}
 

public class AbstractDemo5 {

	public static void main(String[] args) {
		Derived d = new Derived();
		 
        // Calling function defined in class 1 inside main()
        // with object of class 2 inside main() method
        d.fun();
        d.funs();
        Base.demofun();

	}

}
