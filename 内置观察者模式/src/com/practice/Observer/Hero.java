package com.practice.Observer;

/*
 * hero�࣬��װӢ������
 * @param heroName Ӣ������
 * @param heroProfession Ӣ��ְҵ
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
