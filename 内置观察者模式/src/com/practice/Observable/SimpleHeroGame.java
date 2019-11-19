package com.practice.Observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import com.practice.Observer.Hero;

/*
 * SimpleHeroGame类，被观察者类 
 */

public class SimpleHeroGame extends Observable{
	private List<Hero> list;
	private String message;
	
	public SimpleHeroGame() {
		list = new ArrayList<Hero>();
	}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void addHero(Hero heroMessage) {
		list.add(heroMessage);
	}
	
	public void setMeasurements(String message) {
		this.message = message;
		System.out.println("系统发出消息:" + message);
		System.out.println();
		measurementsChanged();
	}
	
	
	public List <Hero> getList(){
		return list;
	}
	
	public String getMessage() {
		return message;
	}
}
