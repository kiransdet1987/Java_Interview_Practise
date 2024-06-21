package com.in28minutes.conditionsIfandSwitch;

public class SwitchExerciseRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(determineNameOfDay(1));

		System.out.println(isWeekDay(10));
	}
	
	
	public static String determineNameOfDay (int dayNumber) {
	
		switch(dayNumber) {
		
		case 0: return "Sunday" ;
		case 1: return "Monday" ;
		case 2: return "Tuesday" ; 
		case 3: return "Wednesday" ;
		case 4: return "Thrusday" ;
		case 5: return "Friday" ;
		
		}
		return "Invalid day selection";
	}
	
	public static boolean isWeekDay(int dayNumber) {
		switch(dayNumber) {
		case 1 :
		case 2 :
		case 3 :
		case 4 :
		case 5 : return true;
		}
		return false;
	}

}
