package com.interview.Questions;

public class ReverseEachWordInSentence {

	/*
	 * Input = "reverse each word in a string"; 
	 * Output ="esrever hcae drow ni a gnirts"
	 */
			
	public static void main(String[] args) {
		String str = "reverse each word in a string";
		String words[] = str.split("\\s");
		String reverseWord = "";
		for (String w : words) 
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord = reverseWord + sb.toString()+" "; 
			}
		System.out.println(reverseWord.trim());
		}

}
