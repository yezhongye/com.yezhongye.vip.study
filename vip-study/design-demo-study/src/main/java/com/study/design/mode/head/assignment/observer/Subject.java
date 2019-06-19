package com.study.design.mode.head.assignment.observer;

/**
 * 
 * 2019年6月19日  下午3:17:06
 * @author zjx
 *
 */
public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
	
}
