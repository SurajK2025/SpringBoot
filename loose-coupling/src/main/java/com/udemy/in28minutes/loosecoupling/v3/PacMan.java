package com.udemy.in28minutes.loosecoupling.v3;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GamingConsole {

	public void run() {
		System.out.println("PacMan game is up and running ...");
	}
}