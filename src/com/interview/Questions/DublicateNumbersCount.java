package com.interview.Questions;

import java.util.HashMap;
import java.util.Map;

public class DublicateNumbersCount {

	public static void main(String[] args) {
         int[] str= {1,2,1,4,7,2};
		
		Map<Integer, Integer> occurance = new HashMap<>();
		for(int s:str) {
			Integer integer=occurance.get(s);
			if(integer==null) {
				occurance.put(s,1);
			}else {
				occurance.put(s,integer+1);
			}
			if(occurance.get(s)!=1) {
				System.out.println(s);
			}
		}
		System.out.println(occurance);
		

	}

}
