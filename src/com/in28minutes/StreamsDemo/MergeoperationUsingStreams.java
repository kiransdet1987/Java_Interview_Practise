package com.in28minutes.StreamsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeoperationUsingStreams {

	public static void main(String[] args) {
	
		ArrayList<String> names = new ArrayList<>();
		names.add("Adhijith");
		names.add("Rahul");
		
		ArrayList<String> names1 = new ArrayList<>();
		names1.add("kiran");
		names1.add("Ajay");
		
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		//newStream.forEach(s->System.out.println(s));
		newStream.sorted().forEach(s->System.out.println(s));
		
		Stream<String> newStream1 = Stream.concat(names.stream(), names1.stream());
		boolean flag = newStream1.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		//Assert.assertTrue(flag);
		
		// Convert the stream into new list after modifications.
		List<String> ls = Stream.of("Rahul","Ajaya","nand","Aspira").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		ls.forEach(s->System.out.println(s));
		// to print based on index after creating new list array.
		System.out.println(ls.get(0));
	}

}
