package com.interview.Questions;

public class LargestNumberOf3Numbers {

	public static void main(String[] args) {
		
		int num1=15;
		int num2=14;
		int num3=17;
		
		int largest = Math.max(Math.max(num1, num2), num3);
		System.out.println(largest);

        if (num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " is the largest number.");
        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " is the largest number.");
        else
            System.out.println(num3 + " is the largest number.");
    }
	

}
