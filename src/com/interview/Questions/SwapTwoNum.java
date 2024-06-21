package com.interview.Questions;

public class SwapTwoNum {

	public static void main(String[] args) {
	    int x = 10;
	    int y = 20;

	    System.out.println("Before swapping: x = " + x + ", y = " + y);

	    // Swap using arithmetic operations
	    x = x + y;
	    y = x - y;
	    x = x - y;

	    
	    
	    int x1 = 10;
	    int y1 = 20;
	    // Swap using a temporary variable
	    int temp = x1;
	    x1 = y1;
	    y1 = temp;
	    
	    System.out.println("After swapping: x = " + x1 + ", y = " + y1);
	    
	  }

}
