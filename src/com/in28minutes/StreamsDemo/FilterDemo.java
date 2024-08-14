package com.in28minutes.StreamsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("Adhijith");
		names.add("Rahul");
		names.add("kiran");
		names.add("Ajay");
		
		int count=0;
		for(int i=0;i<names.size();i++) {
			String actual =names.get(i);
			if(actual.startsWith("A")) {
			count++;
		}
		}
		System.out.println(count);
		
		
		//FILTER
		// Filter operations and getting the count
		long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println("The returned stream value is "+ c);
		
		long d =Stream.of("Rahul","Ajay","nand","Aspir").filter(s->s.startsWith("A")).count();
		System.out.println("The returned stream declared values  is "+ d);
		
		//Filter operation and print it
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//It will limit the result from intermediate operation.
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	
	//MAP - It will modifes the intermediate operation results .
		// filter based on letter ending with "y" and convert it into uppercase and print.
   Stream.of("Rahul","Ajay","nand","Aspiry").filter(s->s.endsWith("y")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
   Stream.of("Rahul","Ajay","nand","Aspiry").map(s->s.toUpperCase()).forEach(s->System.out.println(s));
   

   //Convert Array to list below code.
   //String[] names = {"Alice", "Bob", "Charlie"};
   //List<String> list = Arrays.asList(names);
   
   //SORTING
   // print names which have first letter as a with uppercase and sorted.
   	List<String> name = Arrays.asList("Rahul","Ajay","nand","Aspiry","Adam");
   	name.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	
	
	
	 
}
