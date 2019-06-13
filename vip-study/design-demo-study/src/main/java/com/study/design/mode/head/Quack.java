package com.study.design.mode.head;

import com.study.design.mode.head.inf.QuackBehavior;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Quack");
		
	}

}
