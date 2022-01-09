package com.sau.learnSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.sau.learnSpring.game.GameRunner;

@SpringBootApplication
@ComponentScan({"com.sau.learnSpring","com.sau.learnSpring.game.dummy"})
public class LearnSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringApplication.class ,args);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		/* tight coupling
		
		MarioGame game = new MarioGame();
		SuperContrGame game =new SuperContrGame();
		
		GameRunner runner = new GameRunner(game);
		runner.run();   */
		
		
		/* loose coupling
		 
		GamingConsole game =new MarioGame();
		//GamingConsole game =new SuperContrGame();
	
		GameRunner runner = new GameRunner(game);
		runner.run();*/
	}

}
