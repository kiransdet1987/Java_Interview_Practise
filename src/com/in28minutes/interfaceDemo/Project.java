package com.in28minutes.interfaceDemo;

public class Project {

	public static void main(String[] args) {
		ComplexAlgorithm alg = new RealAlgorithm();
		System.out.println(alg.complexAlgorithm(10, 20));
	}

}
