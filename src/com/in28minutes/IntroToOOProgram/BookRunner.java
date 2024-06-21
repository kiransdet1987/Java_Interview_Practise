package com.in28minutes.IntroToOOProgram;

public class BookRunner {

	public static void main(String[] args) {
		
		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(200);
		Book cleanCode = new Book(300);
		
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
		
		artOfComputerProgramming.noOfCopies =10;
		effectiveJava.noOfCopies =20;
		cleanCode.noOfCopies =30;
		
		
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
		
		
		artOfComputerProgramming.increaseNoOfCopies(10);
		effectiveJava.increaseNoOfCopies(20);
		cleanCode.increaseNoOfCopies(30);
		
		
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
	}

}
