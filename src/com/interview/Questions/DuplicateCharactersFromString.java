package com.interview.Questions;

public class DuplicateCharactersFromString {
	/*
	 * Input = "apple is fruit"; 
	 * Output = p i
	 */
	public static void main(String[] args) {
		String str = "apple is fruit";
		char[] carray = str.toCharArray();
		System.out.println("The string is:" + str);
		System.out.print("Duplicate Characters in above string are: ");
		for (int i = 0; i < str.length(); i++) 
		{
			for (int j = i + 1; j < str.length(); j++) 
			{
				if (carray[i] == carray[j]) 
				{
					System.out.print(carray[j]);
					break; 
					}
				}
			}
		}
	}
//First loop is to find the length and as soon as it finds matching it increments
//and second loop is to check with remaining characters in the character array.