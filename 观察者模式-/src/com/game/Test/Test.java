package com.game.Test;

import com.game.Observer.Hero;
import com.game.Observer.Observer;
import com.game.Observerable.SimpleHeroGame;

public class Test {
	public static void main(String [] args) {
		SimpleHeroGame HeroGlory = new SimpleHeroGame();
		
		Observer HanXin = new Hero("韩信");
		Observer HouYi = new Hero("后羿");
		Observer DianWei = new Hero("典韦");
		Observer DaJi = new Hero("妲己");
		Observer LiuShan = new Hero("刘禅");
		
		HeroGlory.registerObserver(HanXin);
		HeroGlory.registerObserver(HouYi);
		HeroGlory.registerObserver(DianWei);
		HeroGlory.registerObserver(DaJi);
		HeroGlory.registerObserver(LiuShan);
		HeroGlory.setInformation("敌军还有5秒到达战场，请做好准备！");
		
		System.out.println("---------------------------------------------------");
		HeroGlory.setInformation("干将已被甄姬击杀！");
	}
}
