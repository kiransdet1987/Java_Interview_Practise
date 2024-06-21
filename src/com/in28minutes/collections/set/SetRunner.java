package com.in28minutes.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
	
		List<Character> characters = List.of('A','Z','A','B','Z','F');
		
		Set<Character> treeset = new TreeSet<>(characters);  //sorted order
		System.out.println("treeset " + treeset);
		
		
		Set<Character> linkedhashset = new LinkedHashSet<>(characters); // insertion order
		System.out.println("linkedhashset " + linkedhashset);
		
		Set<Character> hashset = new HashSet<>(characters);
		System.out.println("hashset " + hashset);
		

	}

}
