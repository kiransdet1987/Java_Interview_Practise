package com.in28minutes.collections.list;

import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		List<String> words = List.of("Cat","Dog","Pig");
		
		for(int i=0;i<words.size();i++) {
			System.out.println(words.get(i));
		}

		for (String word:words) {
			System.out.println(word);
		}
		
		Iterator wordsIterator =  words.iterator();
		while(wordsIterator.hasNext()) {
			System.out.println(wordsIterator.next());
		}
		
	}

}
