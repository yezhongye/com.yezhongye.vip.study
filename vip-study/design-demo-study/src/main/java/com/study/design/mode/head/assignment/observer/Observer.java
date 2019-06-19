package com.study.design.mode.head.assignment.observer;

/**
 *  所有观察者的共同接口，用来通知观察者
 * @author pc
 *
 */
public interface Observer {
	
	public void update(float temp, float humidity, float pressure);

}
