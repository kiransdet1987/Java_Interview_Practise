package com.interview.Questions;

import java.util.HashMap;
import java.util.Map;

public class AccountNumberValidator {
	
	//Takes an account number string as input.
	//Removes any non-numeric characters from the string.
	//Checks if the cleaned account number is exactly 9 digits long.
	//Returns the cleaned account number if it's valid, or an error message if it's not.
	
	public static Map<String, String> cleanAndValidateAccountNumber(String accountNumber) {
		
        Map<String, String> result = new HashMap<>();
        
        // Remove non-numeric characters
        String cleanedAccountNumber = accountNumber.replaceAll("\\D", "");
        
        // Check if the cleaned account number is exactly 9 digits long
        if (cleanedAccountNumber.length() == 9) {
            result.put("status", "success");
            result.put("cleanedAccountNumber", cleanedAccountNumber);
        } else {
            result.put("status", "error");
            result.put("message", "Account number must be exactly 9 digits long.");
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        String accountNumber = "918-417-564";
        Map<String, String> result = cleanAndValidateAccountNumber(accountNumber);
        
        if (result.get("status").equals("success")) {
            System.out.println("Cleaned Account Number: " + result.get("cleanedAccountNumber"));
        } else {
            System.out.println("Error: " + result.get("message"));
        }
    }
    
//The replaceAll("\\D", "") method removes any non-numeric characters from the input string. 
 //   \\D is a regular expression that matches any non-digit character.
    
}
