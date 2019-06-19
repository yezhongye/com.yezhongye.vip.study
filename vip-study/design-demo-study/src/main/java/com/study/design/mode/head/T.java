package com.study.design.mode.head;

import com.study.design.mode.head.first.MallardDuck;
import com.study.design.mode.head.strategy.Duck;

public class T {
	
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
	}

}
