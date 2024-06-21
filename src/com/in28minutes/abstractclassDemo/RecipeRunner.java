package com.in28minutes.abstractclassDemo;

public class RecipeRunner {

	public static void main(String[] args) {
		
		Receipe1 receipe = new Receipe1();
		receipe.execute();
		
		
		RecipeWithMicroWave recipeWithMicroWave = new RecipeWithMicroWave();
		recipeWithMicroWave.execute();

	}

}
