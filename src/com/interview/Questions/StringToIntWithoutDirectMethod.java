package com.interview.Questions;

//How to convert String to integer without using any direct method in Java.
public class StringToIntWithoutDirectMethod {
	
	public static int stringToInt(String str) {
        int num = 0;
        int sign = 1;
        int i = 0;

        // Check for negative sign
        if (str.charAt(0) == '-') {
            sign = -1;
            i++;
        }
        // Iterate through each character of the string
        while (i < str.length()) {
            char digit = str.charAt(i);
            if (digit < '0' || digit > '9') {
                // If it's not a digit, throw an exception or handle the error
                throw new NumberFormatException("Invalid input string: " + str);
            }
            int value = (int) (digit - '0'); // Convert char to integer value
            num = num * 10 + value; // Build the integer number
            i++;
        }
        return num * sign; // Apply the sign
    }
	public static void main(String[] args) {
	
		String str = "12345";
        int num = stringToInt(str);
        System.out.println("Converted integer: " + num);
    }
}


