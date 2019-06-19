package com.study.design.mode.head.observer;

import com.study.design.mode.head.assignment.observer.DisplayElement;
import com.study.design.mode.head.assignment.observer.Observer;
import com.study.design.mode.head.assignment.observer.Subject;

/**
 * 布告栏类,被通知的对象之一
 * 2019年6月19日  下午4:12:33
 * @author zjx
 *
 */
public class StatissicsDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	/**
	 * 构造器需要weatherData对象，作为注册之用
	 * 2019年6月19日
	 * zjx
	 * pc
	 */
	public StatissicsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Statissics conditions: " + temperature
				+ "F degrees and " + humidity + "% humidity");
		
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
		
	}

}
