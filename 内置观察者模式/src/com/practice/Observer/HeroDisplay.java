package com.practice.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import com.practice.Observable.SimpleHeroGame;

public class HeroDisplay implements Observer{
	private String heroName;
	private String heroProfession;
	private String message;
	private Observable observable;
	private List<Hero> heroMess;
	
	public HeroDisplay(Observable observable) {
		heroMess = new ArrayList<Hero>();
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	public void update(Observable obs, Object arg) {
		if(obs instanceof SimpleHeroGame) {
			SimpleHeroGame weatherData = (SimpleHeroGame) obs;
			heroMess = weatherData.getList();
			message = weatherData.getMessage();
			for(Hero heros:heroMess) {
				System.out.println(heros.getHeroName() + "["+heros.getHeroProfession()+"] 收到消息:" + message);
			}
		}
	}
}
