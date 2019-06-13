package com.study.design.mode.head;

import com.study.design.mode.head.inf.QuackBehavior;

public class Squeak  implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("橡皮鸭子吱吱叫");
		
	}

}
