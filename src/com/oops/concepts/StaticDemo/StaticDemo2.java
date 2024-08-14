package com.oops.concepts.StaticDemo;

class GFG{
	
	final private static String str = "GreekCode";
	
	static class MyNestedClass{
		
		
		public void disp() {
			System.out.println(str);
	}
}
}

public class StaticDemo2 {

	public static void main(String[] args) {
		GFG.MyNestedClass obj = new GFG.MyNestedClass();
		obj.disp();
	}
}
