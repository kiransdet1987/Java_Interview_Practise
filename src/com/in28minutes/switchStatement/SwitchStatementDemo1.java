package com.in28minutes.switchStatement;

public class SwitchStatementDemo1 {

	public static void main(String[] args) {
	
		Integer age = 18;        
        switch (age)  
        {  
            case (16):System.out.println("You are under 18.");  break;  
            case (18):System.out.println("You are eligible for vote."); break;  
            case (65):System.out.println("You are senior citizen.");  break;  
            default: System.out.println("Please give the valid age.");  break;  
        }             
        
        Integer age1 = 200;
        String voatingage = "";
        voatingage = switch (age1)
        		{  
        	case 16->"you are under 18.";
        	case 18->"you are eligible for vote";
        	case 65->"you are senior citizen";
        	default->"Please give valid age";
        };
        System.out.println("The age with lambda expression:-" + voatingage);

        // This is with lambda expression->
        String day = "fri";
        String result = " ";
        
        result = switch(day) {
        	case "sat","sun"->"6am";
        	case "mon","tue","wed","thrus","fri"->"8am";
        	default->"10am";
        };
        System.out.println("The result with lambda expression:-" + result);
        
        
        
        // This is with YIELD statement.
        String day1 = "non";
        String result1 = " ";
        
        result1 = switch(day1) {
        	case "sat","sun": yield "6am";
        	case "mon","tue","wed","thrus","fri": yield "8am";
        	default: yield "10am";
        };
        System.out.println("The result with yield statement:- " + result1);
        
	}

}
