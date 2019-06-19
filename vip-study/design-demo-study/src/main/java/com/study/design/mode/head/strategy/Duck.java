package com.study.design.mode.head.strategy;

import com.study.design.mode.head.inf.FlyBehavior;
import com.study.design.mode.head.inf.QuackBehavior;

public abstract class Duck {
	
	
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	

	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	public void swim() {
		System.out.println("游泳戏水");
	}
	//默认行为
	public abstract void display();
	
	//====
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	
}
