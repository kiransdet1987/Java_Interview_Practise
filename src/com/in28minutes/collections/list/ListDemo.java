package com.in28minutes.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> immutable_list = List.of("Cat","Dog","Pig");
		System.out.println(immutable_list);
		
		//immutable_list.add("hello");

		System.out.println(immutable_list);
		List<String> mutable_list1 = new ArrayList<String>(immutable_list);
		
		mutable_list1.add("buffalo");
		mutable_list1.add(4,"buffalo");
		System.out.println(mutable_list1);
		
		List<String> mutable_list12= new LinkedList<String>(mutable_list1);
		
		mutable_list12.add("hen");
		
		System.out.println(mutable_list12);
		
		List<String> mutable_list3= new Vector<String>(mutable_list12);
		
		mutable_list3.add("frog");
		mutable_list3.add("");
		
		System.out.println(mutable_list3);	
		mutable_list3.remove(2);
		System.out.println(mutable_list3);	
		
		List wordAll = List.of("Cat","Dog","Pig",1,2,3);
		System.out.println(wordAll);
		
		List<Integer>number1 = List.of(20,4,87,25);
		List<Integer> num1 = new ArrayList<Integer>(number1);
		Collections.sort(num1);
		System.out.println(num1);
		

	}

}
