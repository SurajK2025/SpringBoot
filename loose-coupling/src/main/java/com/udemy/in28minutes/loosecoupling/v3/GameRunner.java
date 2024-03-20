package com.udemy.in28minutes.loosecoupling.v3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
