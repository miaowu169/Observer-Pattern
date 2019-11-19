package com.game.Observerable;

import java.util.ArrayList;
import java.util.List;

import com.game.Observer.Observer;
/**
 * ���۲���
 * ʵ����Observerable�ӿڣ���Observerable�ӿڵ��������������˾���ʵ��
 *
 */

public class SimpleHeroGame implements Observerable{
	private String message;
	private List<Observer> list;
	
	public SimpleHeroGame() {
		list = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o) {
		list.add(o);
	}

	public void removeObserver(Observer o) {
		if(!list.isEmpty())
			list.remove(o);
	}

	public void notifyObserver() {
		for(int i = 0;i < list.size();i++) {
			Observer observer = list.get(i);
			observer.update(message);
		}
	}
	
	public void setInformation(String s) {
		this.message = s;
		System.out.println("ϵͳ����������Ϣ:"+ message);
		notifyObserver();
	}
}
