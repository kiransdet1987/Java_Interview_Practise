package com.interview.Questions;

public class primenumberchecktwo {

	public static void main(String[] args) {
		//Prime numbers are natural numbers that are divisible by only 1 and the number itself.
		//2, 3, 5, 7, 11, 13
		
		int num=4;
		
		int count =0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		
		if(count ==2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not prime");
		}

	}

}
