package com.in28minutes.arraysDemo;

public class MinimumNumfrom3dArray {

	public static void main(String[] args) {
	
		int[][] arra = {{3,12,9},{5,10,13},{7,2,8}};
		
		int min=arra[0][0];
		
		for(int i=0;i<3;i++) //row
		{
			for(int j=0;j<3;j++) //coloumn
				{
				if(arra[i][j]<min) {
					min=arra[i][j];
				}
				}
		}
		System.out.print(min);
	}

}
