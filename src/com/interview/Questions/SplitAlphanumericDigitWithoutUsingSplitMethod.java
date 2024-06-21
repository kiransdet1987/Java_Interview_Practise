package com.interview.Questions;

public class SplitAlphanumericDigitWithoutUsingSplitMethod {
	/*
	 * Input = "Welcome234To567Java89Programming0@#!!"; Output =
	 * WelcomeToJavaProgramming 234567890
	 * 
	 * @#!!
	 */
	public static void main(String[] args) {
		
		String str = "Wel234To567Java89Prog0@#!!";
		
		StringBuffer alpha = new StringBuffer(), 
				num = new StringBuffer(), 
				special = new StringBuffer();
		
		for (int i = 0; i < str.length(); i++) 
		{
			if (Character.isAlphabetic(str.charAt(i)))
				alpha.append(str.charAt(i));
			else if (Character.isDigit(str.charAt(i)))
				num.append(str.charAt(i));
			else
				special.append(str.charAt(i));
			}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(special);
		}
	}


