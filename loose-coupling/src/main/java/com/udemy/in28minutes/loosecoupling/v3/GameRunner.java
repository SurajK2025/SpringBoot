package com.udemy.in28minutes.loosecoupling.v3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/* 
Using IoC and DI, the type of game is decided at runtime using appropriate annotations. It helps simplifying the main method.
*/
@Component
public class GameRunner {
	@Autowired
	private GamingConsole gamingConsole;
	
	public GameRunner(GamingConsole gamingConsole) {
		this.gamingConsole = gamingConsole;
	}
	
	public void run() {
		this.gamingConsole.run();
	}
}
