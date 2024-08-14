package com.interview.Questions;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;



public class practiseTestClass {
@Test
	public void charCount() {
		String str = "This is kiran from Hyderabad";
		Map<Character,Integer> occ = new HashMap<>();
		char[] strs = str.toCharArray();
		for(char cha:strs) {
			Integer integer = occ.get(cha);
			if(integer == null) {
				occ.put(cha, 1);
			}else {
				occ.put(cha, integer+1);
			}
		}
		//System.out.println("The duplicate character occurances count : "+ occ);
	}

@Test
	public void wordsCount() {
		String str = "This is kiran from Hyderabad is ";
		Map<String,Integer> occs = new HashMap<>();
		String[] words = str.split(" ");
		for(String word:words) {
			Integer integer = occs.get(word);
			if(integer == null) {
				occs.put(word, 1);
			}else {
				occs.put(word, integer+1);
			}
		}
		//System.out.println("The duplicate word occurances count: "+ occs);
	}
	
@Test
public void duplicateNumbers() {
	int[] nums = {1,2,4,5,1,6,9,9};
	Map<Integer,Integer> numsOcc = new HashMap<>();
	for(int num:nums) {
		Integer integer = numsOcc.get(num);
		if(integer == null) {
			numsOcc.put(num,1);
		}else {
			numsOcc.put(num, integer+1);
		}
	}
//System.out.println("The duplicate number occurances: " +numsOcc);
	
}

@Test
public void duplicateNumbersStartswithOne() {
	
	
	String[] nums  =  {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
	//String with get the numbers as key and integer will hold the values in it.

	Map<String,Integer> numsOccone = new HashMap<>();
	for(String num:nums) {
	
	if (num.startsWith("1")) {
		Integer integer = numsOccone.get(num);
		if(integer == null) {
			numsOccone.put(num,1);
		}else {
			numsOccone.put(num, integer+1);
		}
	}
	}
//System.out.println("The number Occurance starts with one : "+ numsOccone.values());
int sum=0;
for (int value : numsOccone.values()) {
   sum += value;
}
//System.out.println("The number that starts with 1 total count is :" + sum);


}

@Test
public void reverseWords() {
	String textis = "This is kiran";
	String[] newText = textis.split(" ");
	String s2 = "";
	for(String news:newText) {
		//System.out.println("The String is new :" + news);
			for(int i = news.length() - 1; i >= 0; i--) {
				s2 = s2 +news.charAt(i);
		}	
			
	}
	System.out.println("The reverse String is:- " +s2);
	
}

@Test
public void DuplicateWords() {
	
		String input="rahul testing is important testing is kiran rahul" ;
		Map<String,Boolean> wordMap = new HashMap<>();
		 StringBuilder result = new StringBuilder();
		String[] inputss = input.split(" ");
		
		for(String ins:inputss) {
			if (!wordMap.containsKey(ins)) {
                wordMap.put(ins, true);
                result.append(ins).append(" ");
            }
        }
		System.out.println(result.toString().trim());
}
}
