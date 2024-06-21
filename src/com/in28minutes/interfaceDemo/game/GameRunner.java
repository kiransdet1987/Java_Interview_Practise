package com.in28minutes.interfaceDemo.game;

public class GameRunner {

	public static void main(String[] args) {
		
		MarioGame mariogame = new MarioGame();
		mariogame.up();
		mariogame.down();
		mariogame.right();
		mariogame.left();
		
		ChessGame chessgame = new ChessGame();
		chessgame.down();
		chessgame.left();
		chessgame.right();
		chessgame.up();

		
		GamingConsole game = new ChessGame();
		game.down();
		game.left();
		game.right();
		game.up();
		
		GamingConsole[] gamess= {new ChessGame(), new MarioGame()} ;
		for(GamingConsole game1: gamess) {
			game1.down();
			game1.left();
			game1.right();
			game1.up();
		}
	}
	}
	
