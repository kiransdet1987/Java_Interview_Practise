package com.in28minutes.enumsDemo;

public class enumsWithSwitch {

	public enum day{
		sun,mon,Tue,wed,Thrus,fri,sat
		};

	
	public static void main(String[] args) {

		day[] dayNow = day.values();
		for(day now:dayNow) {
			switch(now) 
			{
				case sun: System.out.println("It's sunday"); break;
				case mon: System.out.println("It's Monday"); break;
				case Tue: System.out.println("It's Tuesday"); break;
				case wed: System.out.println("It's Wednesday"); break;
				case Thrus: System.out.println("It's Thrusday"); break;
				case fri: System.out.println("It's Friday"); break;
				case sat: System.out.println("It's saturday"); break;	
			}
		
		}
		
		

	}

}
