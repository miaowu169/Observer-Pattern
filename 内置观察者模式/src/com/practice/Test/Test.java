package com.practice.Test;

import com.practice.Observable.SimpleHeroGame;
import com.practice.Observer.HeroDisplay;
import com.practice.Observer.Hero;

public class Test {
	public static void main(String [] args) {
		SimpleHeroGame wd = new SimpleHeroGame();
		HeroDisplay ccd = new HeroDisplay(wd);
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		Hero HanXin = new Hero("韩信","刺客");
		Hero DaJi = new Hero("妲己","法师");
		Hero LiuShan = new Hero("刘禅","辅助");
		Hero Kai = new Hero("铠","战士");
		Hero HouYi = new Hero("后羿","射手");
		
		wd.addHero(HanXin);
		wd.addHero(DaJi);
		wd.addHero(LiuShan);
		wd.addHero(Kai);
		wd.addHero(HouYi);
		
		wd.setMeasurements("敌军还有5秒到达战场，请做好准备！");
		System.out.println("-------------------------------");
		wd.setMeasurements( "干将已被甄姬击杀！");
	}
}
