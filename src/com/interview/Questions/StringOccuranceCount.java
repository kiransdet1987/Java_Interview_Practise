package com.interview.Questions;

import java.util.HashMap;
import java.util.Map;

public class StringOccuranceCount {


	public static void main(String[] args) {
		String str= "This is an awesome occasion. This has never happened before.";
		Map<String, Integer> stroccurance = new HashMap<>();
		String[] words = str.split(" ");
	for(String word:words) {
		Integer integer=stroccurance.get(word);
		if(integer==null) {
			stroccurance.put(word,1);
		}else {
			stroccurance.put(word,integer+1);
		}
	}
	System.out.println(stroccurance);

	}

}
