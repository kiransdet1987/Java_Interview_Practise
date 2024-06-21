package com.in28minutes.interfaceDemo.game;

public class ChessGame implements GamingConsole {
	
	@Override
	public void up() {
		System.out.println("move piece up");
		
	}

	@Override
	public void down() {
		System.out.println("move piece down");
		
	}

	@Override
	public void left() {
	
		
	}

	@Override
	public void right() {
		System.out.println("move the coin forward");
		
	}

	

}
