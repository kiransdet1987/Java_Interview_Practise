package com.in28minutes.firstjavaproject;

public class Multiplcationtable {
	
	void printTable() {
		printTable(5);
	}

	void printTable(int tab) {
		printTable(tab,1,5);
	}
	void printTable(int t, int from, int to) {
		for(int i=from;i<=to;i++) {
			System.out.printf("%d * %d = %d",t,i,t*i).println();
		}
	}
}
