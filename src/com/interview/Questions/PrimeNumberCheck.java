package com.interview.Questions;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        boolean isPrime = true;

	        if (number <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(number); i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            
	          /*  return IntStream.rangeClosed(2, (int) Math.sqrt(num)) // Stream of potential divisors (2 to sqrt(num))
	                    .noneMatch(i -> num % i == 0); // Check if any divisor di */
	        }

	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }

	        scanner.close();
	    }
	
	
	

	}
