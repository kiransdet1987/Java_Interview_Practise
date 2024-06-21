package com.in28minutes.arraysDemo;

public class MultiDimensionArrayExample {

	public static void main(String[] args) {
		
		
		/*
		 * 3[00]	 5[01]		 6[02] 
		 * 2[10]	 11[11]		 8[12] 
		 * 9[20]	 10[21]		 7[22]
		 * 
		 * int[3][3] --- 3 rows/3 columns
		 */
		
		
		int a[][] = new int[3][3];
		
		int[][] arra = {{3,1,9},{5,10,13},{7,2,8}};
		//Arrays.stream(arr).flatMapToInt(Arrays::stream).forEach(System.out::println);
		// Convert the 2D array to a Stream of individual elements
	//	Arrays.stream(arra).flatMapToInt(Arrays::stream).forEach(num -> System.out.print(num + " "));
	
	
		
		a[0][0] = 3;
		a[0][1] =5;
		a[0][2] =6;
		
		a[1][0] = 2;
		a[1][1] =11;
		a[1][2] =8;
		
		a[2][0] = 9;
		a[2][1] =10;
		a[2][2] =7;
		
		
		//System.out.println(a[2][1]);
		for(int i=0;i<3;i++) //row
			{
				for(int j=0;j<3;j++) //coloumn
					{
						System.out.print(a[i][j]);
						System.out.print(" ");
						
					}
				System.out.println("\t");
			}
		}
	
	
	

	}


