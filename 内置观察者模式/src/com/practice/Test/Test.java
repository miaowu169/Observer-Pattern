package com.practice.Test;

import com.practice.Observable.SimpleHeroGame;
import com.practice.Observer.HeroDisplay;
import com.practice.Observer.Hero;

public class Test {
	public static void main(String [] args) {
		SimpleHeroGame wd = new SimpleHeroGame();
		HeroDisplay ccd = new HeroDisplay(wd);
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		Hero HanXin = new Hero("����","�̿�");
		Hero DaJi = new Hero("槼�","��ʦ");
		Hero LiuShan = new Hero("����","����");
		Hero Kai = new Hero("��","սʿ");
		Hero HouYi = new Hero("����","����");
		
		wd.addHero(HanXin);
		wd.addHero(DaJi);
		wd.addHero(LiuShan);
		wd.addHero(Kai);
		wd.addHero(HouYi);
		
		wd.setMeasurements("�о�����5�뵽��ս����������׼����");
		System.out.println("-------------------------------");
		wd.setMeasurements( "�ɽ��ѱ��缧��ɱ��");
	}
}
