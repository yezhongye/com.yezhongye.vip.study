package com.study.design.mode.head.strategy;

import com.study.design.mode.head.inf.FlyBehavior;

public class FlyWithWings  implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I'm flying");
		
	}

}
