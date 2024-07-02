package com.interview.Questions;

import java.util.HashMap;
import java.util.Map;

public class NumberOccurance {

	public static void main(String[] args) {
		
		int[] array ={ 4,5,5,5,4,6,6,9,4}; 

		//key-numbers/values-counts
        Map<Integer, Integer> elementCountMap = new HashMap<>();  
        for (int num : array) {
            if (elementCountMap.containsKey(num)) {
            	elementCountMap.put(num,elementCountMap.get(num) + 1);
            } else {
                // If element is not present in map, add it with count 1
                elementCountMap.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
        	System.out.println(entry.getKey()+ "repeted:" + entry.getValue());
            }

	}

}
