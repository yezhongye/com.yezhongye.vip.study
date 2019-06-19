package com.study.design.mode.pattern;

import org.junit.Test;

import com.study.design.mode.head.observer.CurrentConditionsDisplay;
import com.study.design.mode.head.observer.ForecastDisplay;
import com.study.design.mode.head.observer.StatissicsDisplay;
import com.study.design.mode.head.observer.WeatherData;

public class ObserverPatternTest {
	
	@Test
	public void startWeatherStation() {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatissicsDisplay statissicsDisplay = new StatissicsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 30.4f);
	}

}
