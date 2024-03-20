package com.udemy.in28minutes.loosecoupling.v2;

public class GameRunner {
	private GamingConsole gamingConsole;
	
	public GameRunner(GamingConsole gamingConsole) {
		this.gamingConsole = gamingConsole;
	}
	
	public void run() {
		this.gamingConsole.run();
	}
}
