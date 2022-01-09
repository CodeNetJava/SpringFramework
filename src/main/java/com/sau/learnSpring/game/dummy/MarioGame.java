package com.sau.learnSpring.game.dummy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.sau.learnSpring.game.GamingConsole;

@Component
//@Primary
public class MarioGame implements GamingConsole {
	
	@Override
	public void up() {
		System.out.println("MarioGame up");
	}
	
	@Override
	public void down() {
		System.out.println("down");
	}
	
	@Override
	public void left() {
		System.out.println("left");
	}
	
	@Override
	public void right() {
		System.out.println("right");
	}

}
