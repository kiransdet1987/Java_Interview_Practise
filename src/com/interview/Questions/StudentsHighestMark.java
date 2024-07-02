package com.interview.Questions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class StudentsHighestMark {

	public static void main(String[] args) {
			
		Map<String,Integer> map = new HashMap<>();
		//Map<Student,marks> map = new HashMap<Student,marks>();
		map.put("Rahul", 28);
		map.put("Ashok", 99);
		map.put("kiran", 65);	
		map.put("Ramu", 98);
		//System.out.println(map.entrySet());
		
		int maxMarks = Integer.MIN_VALUE;
        String studentWithMaxMarks = "";
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String student = entry.getKey();
            int marks = entry.getValue();
            
            if(marks > maxMarks) {
            	maxMarks = marks;
                studentWithMaxMarks = student;
            }
		}
		System.out.println("Student with maximum marks: " + studentWithMaxMarks);
        System.out.println("Maximum marks obtained: " + maxMarks);
        
//        Set<Integer> sortedStudents = new TreeSet<>(map.values());
//        System.out.println(sortedStudents);
        
    
     // Creating a TreeMap to store sorted entries
        TreeMap<String, Integer> sortedMarks = new TreeMap<>(new ValueComparator(map));
        sortedMarks.putAll(map);
     // Displaying sorted entries
        System.out.println("Students sorted by marks:");
        for (Map.Entry<String, Integer> entry : sortedMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}
}

	// Comparator class to compare values (marks) in the map
	class ValueComparator implements Comparator<String> {
	    Map<String, Integer> map;
	    
	    public ValueComparator(Map<String, Integer> map) {
	        this.map = map;
	    }
	    
	    @Override
	    public int compare(String s1, String s2) {
	        if (map.get(s1) >= map.get(s2)) {
	            return -1; // Sort in descending order (change to 1 for ascending)
	        } else {
	            return 1; // Sort in descending order (change to -1 for ascending)
	        }
	    }
}

