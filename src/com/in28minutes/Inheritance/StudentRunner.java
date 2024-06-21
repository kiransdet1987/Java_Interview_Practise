package com.in28minutes.Inheritance;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		
		Student student = new Student("Kal","P V C");
		
//		student.setName("ranga");
//		student.setEmail("in28minutes@gmail.com");
		
		
		Employee employee = new Employee("Rahul","Programmer Analyst");
		employee.setEmployerName("Ranga");
		employee.setEmail("dasddas@gmail.com");
		employee.setPhoneNumber("123 - 123- 1234");
		//employee.setSalary(12);
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer Analyst");
		
		System.out.println(employee);

	}

	
	//STUDENT & PERSON classes are related here. we need to maintain a IS-A relationship
	
	
}
