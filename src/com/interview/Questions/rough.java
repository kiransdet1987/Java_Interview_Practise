package com.interview.Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class rough {
	public static void main(String[] args) {
		 int x=10;
		 String d =x+"test";
		 System.out.println("The string is : " + d);
		 
		 ArrayList<String> al = new ArrayList<String>();
		 al.add("Raj");
		 al.add("Prerna");
		 al.add("Ankit");
		 Object[] d1 = al.toArray(); //Convert ArrayList to Object[]
		 System.out.println(Arrays.toString(d1));
	}
	
	}

