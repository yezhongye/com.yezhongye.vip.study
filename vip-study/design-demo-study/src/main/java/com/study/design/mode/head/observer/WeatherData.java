package com.study.design.mode.head.observer;

import java.util.ArrayList;

import com.study.design.mode.head.assignment.observer.Observer;
import com.study.design.mode.head.assignment.observer.Subject;

/**
 * 天气数据
 * 2019年6月19日  下午3:21:18
 * @author zjx
 *
 */
public class WeatherData implements Subject{
	
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i > 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
		
	}
	/**
	 * 当气象站有数据观测值更新时，我们通知观察者
	 * 2019年6月19日
	 * pc
	 * zjx
	 */
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
