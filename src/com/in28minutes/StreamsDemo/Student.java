package com.in28minutes.StreamsDemo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class Student {

	public static void main(String[] args) {
		 String name;
		 int marks;
		  
		  HashMap<String, Integer> studentMarks = new HashMap<>();
		  studentMarks.put("Alice", 85);
		  studentMarks.put("Bob", 92);
		  studentMarks.put("Charlie", 78);
		  
		  Entry<String, Integer> maxEntry = studentMarks.entrySet().stream().max(Comparator.comparingInt(Entry::getValue)).orElse(null);

//Get the student name and maximum marks
String studentName = maxEntry.getKey();
int maxMarks = maxEntry.getValue();

System.out.println("Student with maximum marks: " + studentName + " (" + maxMarks + ")");

	}

}
