package com.in28minutes.collections.mapsdemo;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {

	public static void main(String[] args) {

		// Create a HashMap to store student IDs and names
	    Map<Integer, String> students = new HashMap<>();

	    // Add students to the HashMap
	    students.put(1001, "Alice");
	    students.put(1002, "Bob");
	    students.put(1003, "Charlie");

	    // Get the name of a student by ID
	    String name = students.get(1002);
	    System.out.println("Student with ID 1002: " + name);

	    // Check if a student exists by ID
		
		  if (students.containsKey(1004)) 
		  {
		  System.out.println("Student with ID 1004 exists"); 
		  } 
		  else 
		  {
		  System.out.println("Student with ID 1004 does not exist"); 
		  }
		 

	    // Iterate over the HashMap entries
	    for (Map.Entry<Integer, String> entry : students.entrySet()) {
	      System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
	    }
	  }
}
