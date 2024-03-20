package com.udemy.in28minutes.loosecoupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.udemy.in28minutes.loosecoupling.v3.GameRunner;

@SpringBootApplication
public class LooseCouplingApplication {

	/*
	TightCoupling
	public static void main(String[] args) {
		Mario mario = new Mario();
		PacMan pacman = new PacMan();

		GameRunner marioGameRunner = new GameRunner(mario);
		marioGameRunner.runMario();

		GameRunner pacmanGameRunner = new GameRunner(pacman);
		pacmanGameRunner.runPacMan();
	}
	 */

	/*	
	LooseCoupling - Using Java Interfaces
	public static void main(String[] args) {
		Mario mario = new Mario();
		PacMan pacman = new PacMan();

		GameRunner marioGameRunner = new GameRunner(mario);
		marioGameRunner.run();

		GameRunner pacmanGameRunner = new GameRunner(pacman);
		pacmanGameRunner.run();
	}
	 */

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LooseCouplingApplication.class, args);
		GameRunner gameRunner = context.getBean(GameRunner.class);
		gameRunner.run();
	}
}