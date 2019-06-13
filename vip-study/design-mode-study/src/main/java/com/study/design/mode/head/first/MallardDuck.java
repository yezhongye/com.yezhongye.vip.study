package com.study.design.mode.head.first;

import com.study.design.mode.head.Duck;
import com.study.design.mode.head.FlyWithWings;
import com.study.design.mode.head.Quack;

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
