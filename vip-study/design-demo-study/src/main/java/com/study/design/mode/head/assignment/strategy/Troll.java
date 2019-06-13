package com.study.design.mode.head.assignment.strategy;

/**
 *   	矮人
 * @author pc
 *
 */
public class Troll extends Character{
	
	public Troll() {
		weaponBehavior = new AxeBehavior();
	}

	@Override
	public void fight() {
		System.out.println("矮人出场");
	}

}
