package com.in28minutes.collections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class DescendingStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(),student2.getId());
	}
	
}

public class StudentCollectionRunner {

	public static void main(String[] args) {
		
		List<Student> students = List.of(new Student(1,"Ranga"), new Student(100,"Adams"), new Student(2,"Eves"));

		List<Student> studentAl = new ArrayList<>(students);
		
		System.out.println(studentAl);
		
		Collections.sort(studentAl);
		System.out.println("Ascending Order" + studentAl);
		
		//Collections.sort(studentAl, new DescendingStudentComparator());
		//System.out.println("DescendingStudentComparator " + studentAl);
		
		studentAl.sort(new DescendingStudentComparator());
		System.out.println("DescendingStudentComparator " + studentAl);
		
	}

}
