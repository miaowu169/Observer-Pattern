package com.game.Test;

import com.game.Observer.Hero;
import com.game.Observer.Observer;
import com.game.Observerable.SimpleHeroGame;

public class Test {
	public static void main(String [] args) {
		SimpleHeroGame HeroGlory = new SimpleHeroGame();
		
		Observer HanXin = new Hero("����");
		Observer HouYi = new Hero("����");
		Observer DianWei = new Hero("��Τ");
		Observer DaJi = new Hero("槼�");
		Observer LiuShan = new Hero("����");
		
		HeroGlory.registerObserver(HanXin);
		HeroGlory.registerObserver(HouYi);
		HeroGlory.registerObserver(DianWei);
		HeroGlory.registerObserver(DaJi);
		HeroGlory.registerObserver(LiuShan);
		HeroGlory.setInformation("�о�����5�뵽��ս����������׼����");
		
		System.out.println("---------------------------------------------------");
		HeroGlory.setInformation("�ɽ��ѱ��缧��ɱ��");
	}
}
