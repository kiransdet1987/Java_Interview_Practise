package com.interview.Questions;

import java.util.HashMap;
import java.util.Map;

public class WordsOccuranceInString {

	public static void main(String[] args) {
String str= "This is an awesome occasion. This has never happened before.";
		
		Map<Character, Integer> occurance = new HashMap<>();
		char[] characters = str.toCharArray();
		for(char character:characters) {
			Integer integer=occurance.get(character);
			if(integer==null) {
				occurance.put(character,1);
			}else {
				occurance.put(character,integer+1);
			}
		}
		System.out.println(occurance);

	}

	//1. Assign string to variable to store.
	// Create a map to store characters, integers(count purpose).
	// convert string to characters.
	//Bring into the loop with characters and check for occurance(count)
	//if again occurs, increase the count.
	
	
}
