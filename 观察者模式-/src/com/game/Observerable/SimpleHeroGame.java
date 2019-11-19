package com.game.Observerable;

import java.util.ArrayList;
import java.util.List;

import com.game.Observer.Observer;
/**
 * 被观察者
 * 实现了Observerable接口，对Observerable接口的三个方法进行了具体实现
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
		System.out.println("系统发出发出消息:"+ message);
		notifyObserver();
	}
}
