package com.interview.Questions;

import java.util.HashMap;
import java.util.Map;

public class findduplicates {
	
	public static void main(String[] args) {
        Object[] array = {1, 2, 1, 2, 'a', 'b', 'd', 'a'};
        Map<Object, Integer> map = new HashMap<>();
        
        // Count occurrences of each element
        for (Object element : array) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        
        // Print duplicates
        System.out.println("Duplicates are:");
        for (Map.Entry<Object, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }

}
