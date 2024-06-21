package com.in28minutes.arraysDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsMultiDimensionDemo {

	public static void main(String[] args) {
		String[][] strs = {{"ram","bob","cat"},{"sho","see","tyb"},{"sfs","red","dose"}};
		// Combine elements within each row using streams
		List<String> rowStrings = Arrays.stream(strs).map(row -> String.join(", ", row)).collect(Collectors.toList());

		// Print each row with a newline
		for (String row : rowStrings) {
		  System.out.println(row);
		}
		
		  System.out.println("Done------------");
		for(int i=0;i<3;i++) //row
			{
				for(int j=0;j<3;j++) //coloumn
					{
						System.out.print(strs[i][j]);
						System.out.print(" ");
						
					}
				System.out.println("\t");
			}
		}

	}


