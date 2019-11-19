package com.game.Observer;

/**
 * 观察者
 * 实现了update方法
 *
 */

public class Hero implements Observer{
	public String name;
	public String message;
	
	public Hero(String heroName) {
		this.name = heroName;
	}
	
	public void update(String message) {
		this.message = message;
		read();
	}
	
	public void read() {
		System.out.println(name + "接受消息:" + message);
	}
}
