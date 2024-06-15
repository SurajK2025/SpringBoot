package com.udemy.in28minutes.loosecoupling.v1;

/* 
 * GameRunner has to have dedicated methods for each type of game.
 */
public class GameRunner {
	
	private Mario mario;
	private PacMan pacman;

	public GameRunner(Mario mario) {
		this.mario = mario;
	}
	
	public GameRunner(PacMan pacman) {
		this.pacman = pacman;
	}
	
	public void runMario() {
		mario.run();
	}
	
	public void runPacMan() {
		pacman.run();
	}

}