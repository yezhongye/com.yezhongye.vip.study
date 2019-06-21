package com.study.design.mode.head.observer;

import java.util.Observable;

/**
 * 天气数据
 * 2019年6月19日  下午3:21:18
 * @author zjx
 *
 */
public class WeatherDataJDK extends Observable{
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherDataJDK() {}
	
	/**
	 * 当气象站有数据观测值更新时，我们通知观察者
	 * 2019年6月19日
	 * pc
	 * zjx
	 */
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	

}
