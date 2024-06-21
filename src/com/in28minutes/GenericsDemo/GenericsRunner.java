package com.in28minutes.GenericsDemo;

public class GenericsRunner {

	public static void main(String[] args) {

		MyCustomList<String> list = new MyCustomList<String>();

		list.addElement("Element1");
		list.addElement("Element2");
		String value = list.get(0);
		
		System.out.println(list);
		System.out.println(value);

		MyCustomList<Integer> list2 = new MyCustomList<>();

		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(59));
		Integer number = list2.get(0);

		System.out.println(list2);
		System.out.println(number);
	}

}
