package com.udemy.in28minutes.loosecoupling.v2;

/* 
 * With the use of a parent interface for all games, we have simplified the GameRunner class.
 */
public class GameRunner {
	private GamingConsole gamingConsole;
	
	public GameRunner(GamingConsole gamingConsole) {
		this.gamingConsole = gamingConsole;
	}
	
	public void run() {
		this.gamingConsole.run();
	}
}
