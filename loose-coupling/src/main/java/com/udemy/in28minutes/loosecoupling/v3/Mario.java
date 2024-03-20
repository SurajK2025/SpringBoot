package com.udemy.in28minutes.loosecoupling.v3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mario implements GamingConsole {

	public void run() {
		System.out.println("Mario game is up and running ...");
	}
}