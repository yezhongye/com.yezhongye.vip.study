package com.study.design.mode.head.strategy;

import com.study.design.mode.head.inf.QuackBehavior;

public class MuteQuack  implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("什么都不做，不会叫");
		
	}

}
