package com.game.Observer;

/**
 * �۲���
 * ʵ����update����
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
		System.out.println(name + "������Ϣ:" + message);
	}
}
