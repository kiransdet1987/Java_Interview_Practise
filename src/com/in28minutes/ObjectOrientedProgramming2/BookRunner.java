package com.in28minutes.ObjectOrientedProgramming2;

public class BookRunner {

	public static void main(String[] args) {
	
		Book book = new Book(123, "Object Oriented Programming with Java", "Ranga");
		
		book.addReview(new Review(10,"Great Boook", 5));
		book.addReview(new Review(101,"Awesome", 5));

		System.out.println(book);
	}
	
	
	
	// related to BOOK and REVIEW classes/

}
