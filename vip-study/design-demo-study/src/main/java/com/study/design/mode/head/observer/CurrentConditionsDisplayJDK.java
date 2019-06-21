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
public class CurrentConditionsDisplayJDK implements Observer, DisplayElement{

	Observable observable;
	private float temperature;
	private float humidity;
	
	/**
	 * 构造器需要weatherData对象，作为注册之用
	 * 2019年6月19日
	 * zjx
	 * pc
	 */
	public CurrentConditionsDisplayJDK(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	@Override
	public void update(Observable obs,Object arg) {
		if(obs instanceof WeatherDataJDK) {
			WeatherDataJDK weatherDataJDK = (WeatherDataJDK)obs;
			this.temperature = weatherDataJDK.getTemperature();
			this.humidity = weatherDataJDK.getHumidity();
			display();
		}
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature
				+ "F degrees and " + humidity + "% humidity");
		
	}



}
