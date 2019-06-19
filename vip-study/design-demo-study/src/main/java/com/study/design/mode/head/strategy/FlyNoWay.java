package com.study.design.mode.head.strategy;

import com.study.design.mode.head.inf.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("鸭子不会飞");
		
	}

}
