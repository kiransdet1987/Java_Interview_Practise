package com.in28minutes.arraysDemo;

public class MaxNumberfromMinvaluecolumn {
	
	public static void main(String[] args) {
	
int[][] arra = {{3,2,9}
					 ,{5,10,13}
					  ,{7,21,8}};
		
		int min=arra[0][0];
		int minColumn=0;
		
		for(int i=0;i<3;i++) //row
		{
			for(int j=0;j<3;j++) //coloumn
				{
				if(arra[i][j]<min) {
					min=arra[i][j];
					minColumn=j;   //[2][1] [i][j]
					
				}
				}
		}
		int max =arra[0][minColumn];
		int k=0;
		while(k<3) {
			if(arra[k][minColumn]>max) {
				max=arra[k][minColumn];
			}
			k++;
		}
			
		System.out.print(max);
	}
		

	}

/*
 * 3	 5		 6
 * 2	 11	 8
 * 9	 10	7
 * 
 * int[3][3] --- 3 rows/3 columns
*   find the min number from the above matrix then find the larger number from that column.
*   ex:- 2 is min and max is 9
*   
*   Find the minimum number
*   Identify the column of minimum number
*   find the max number in identified column
 */

