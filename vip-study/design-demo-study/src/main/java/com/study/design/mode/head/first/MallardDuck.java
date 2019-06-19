package com.study.design.mode.head.first;

import com.study.design.mode.head.strategy.Duck;
import com.study.design.mode.head.strategy.FlyWithWings;
import com.study.design.mode.head.strategy.Quack;

public class MallardDuck extends Duck{

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
		}


	
	@Override
	public void display() {
		System.out.println("I’m a real Mallard duck");
	}

}
