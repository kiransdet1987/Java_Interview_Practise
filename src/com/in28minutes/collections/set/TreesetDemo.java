package com.in28minutes.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> num = new TreeSet<>(Set.of(65,54,34,12,99));
		
		System.out.println(num);
		
		System.out.println(num.floor(34));
		
		System.out.println(num.lower(34));
		
		System.out.println(num.higher(34));
		
		System.out.println(num.ceiling(34));
		
		System.out.println(num.subSet(34,100));
		
		System.out.println(num.headSet(54));
		

	}

}
