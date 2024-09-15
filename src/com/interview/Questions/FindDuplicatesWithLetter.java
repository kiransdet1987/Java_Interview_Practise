package com.interview.Questions;

public class FindDuplicatesWithLetter {
	    public static void main(String[] args) {
	        String str = "Automation done by kiran kumar";
	        char kcount = 'k';
	        char acount = 'A';
	        long kc = str.chars()
	                        .filter(c -> c == kcount)
	                        .count();
	        long ac = str.chars()
	                        .filter(c -> c == acount)
	                        .count();
	        System.out.println("k occurances "+ kc);
	        System.out.println("a occurances "+ ac);

	    }
	}

