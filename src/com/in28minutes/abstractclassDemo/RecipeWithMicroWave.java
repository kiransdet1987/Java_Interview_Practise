package com.in28minutes.abstractclassDemo;

public class RecipeWithMicroWave extends AbstractRecipe {
	
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Switch on the microwave");
	}
	
	
	void doTheDish() {
		System.out.println("get stufff ready");
		System.out.println("put it in the microwave");
	}
	
	
	void cleanUp() {
		System.out.println("CleanUp the utensils");
		System.out.println("Switch off the microwave");
	}

}
