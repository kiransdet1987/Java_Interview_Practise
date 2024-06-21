package com.in28minutes.loops;

public class WhileNumberPlayer {
	
	private int limit;
	
	
	public WhileNumberPlayer(int i) {
		this.limit = i;
	}




	public void printSquaresUptoLimit(){
		int k=1;
		while(k*k < limit) {
			System.out.print (k * k + " ");
			k++;			
		}
System.out.println();
		
	}

	
	
	
	public void printCubesUptoLimit(){
		int k=1;
		while(k*k *k< limit) {
			System.out.print( k * k * k + " ");
			k++;			
		}
		System.out.println();
	}
}
