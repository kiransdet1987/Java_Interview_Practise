package com.in28minutes.arraysDemo;

public class SingleArrayDemo {

	public static void main(String[] args) {
		
		int[] a = new int[4];
		a[0] = 1;
		a[1] = 5;
		a[2] =8;
		a[3] =10;
		
		for(int elements:a){
			System.out.println("The elements are : " + elements);
		}
		
		for(int i=0; i<a.length;i++) {
			System.out.println("The elements are : " + a[i]);
		}
		
		int b[] = {6,12,18,1};
		for(int i=0; i<b.length;i++) {
			System.out.println("The elements are : " + b[i]);
		}
		}
	


	}


