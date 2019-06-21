package com.study.design.mode.head.observer;

import java.util.Observable;
import java.util.Observer;

import com.study.design.mode.head.assignment.observer.DisplayElement;

/**
 * 布告栏类,被通知的对象之一
 * 2019年6月19日  下午4:12:33
 * @author zjx
 *
 */
public class ForecastDisplayJDK implements Observer, DisplayElement{

	Observable observable;
	private float currentPressure = 29.92f;
	private float lastPressure;
	/**
	 * 构造器需要weatherData对象，作为注册之用
	 * 2019年6月19日
	 * zjx
	 * pc
	 */
	public ForecastDisplayJDK(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}
	@Override
	public void update(Observable observable,Object arg) {
		if(observable instanceof WeatherDataJDK) {
			WeatherDataJDK weatherDataJDK = (WeatherDataJDK)observable;
			this.lastPressure = currentPressure;
			currentPressure = weatherDataJDK.getPressure();
			display();
		}
		
	}
	
	@Override
	public void display() {
		System.out.println("Forecast conditions: " + currentPressure
				+ "F degrees and last pressure is " + lastPressure + "%");
		
	}



}
