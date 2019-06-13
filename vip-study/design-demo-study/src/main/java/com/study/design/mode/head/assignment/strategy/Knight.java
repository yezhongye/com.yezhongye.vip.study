package com.study.design.mode.head.assignment.strategy;

/**
 * 	骑士
 * @author pc
 *
 */
public class Knight extends Character{
	
	public Knight() {
		weaponBehavior = new BowAndArrowBehavior();
	}

	@Override
	public void fight() {
		System.out.println("骑士出场");
		
	}

}
