package com.practice.Observer;

/*
 * hero类，封装英雄属性
 * @param heroName 英雄名字
 * @param heroProfession 英雄职业
 */

public class Hero {
	private String heroName;
	private String heroProfession;
	
	public Hero(String heroName,String heroProfession) {
		this.heroName = heroName;
		this.heroProfession = heroProfession;
	}
	
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getHeroProfession() {
		return heroProfession;
	}
	public void setHeroProfession(String heroProfession) {
		this.heroProfession = heroProfession;
	}
}
