package com.sau.learnSpring.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	
	
 // using constructor
    GamingConsole game;
	@Autowired
    public GameRunner(GamingConsole game) {
		System.out.println("using constructor");
		this.game = game;
	}
	
	
//// using setter
//GamingConsole game;
//@Autowired
//public void setGame(GamingConsole game) {
//	System.out.println("using setter");
//	this.game = game;
//}
	
	
//	// field
//		@Autowired
//		GamingConsole game;

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
		
		
	}



}
