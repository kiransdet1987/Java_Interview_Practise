package com.interview.Questions;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {

	public static void main(String[] args) {
	
		String input="rahul testing is important testing is kiran rahul" ;
		Map<String,Boolean> wordMap = new HashMap<>();
		 StringBuilder result = new StringBuilder();
		String[] inputs = input.split(" ");
		for(String in:inputs) {
			if (!wordMap.containsKey(in)) {
                wordMap.put(in, true);
                result.append(in).append(" ");
            }
        }
		System.out.println(result.toString().trim());
	}
}
		
