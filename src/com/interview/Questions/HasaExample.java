package com.interview.Questions;

class Address{
	
	String city;
	String state;
	String country;
	
	public Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
}



public class HasaExample {
	int id;
	String name;
	Address address;
	
	public HasaExample(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display(){  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
		}  
		  
		public static void main(String[] args) {  
		Address address1=new Address("gzb","UP","india");  
		Address address2=new Address("gno","UP","india");  
		  
		HasaExample e=new HasaExample(111,"varun",address1);  
		HasaExample e2=new HasaExample(112,"arun",address2);  
		      
		e.display();  
		e2.display();  
		      
		}  
	
	

}
