package com.study.design.mode.head.assignment.strategy;

/**
 * 	女王
 * @author pc
 *
 */
public class Queen extends Character{
	
	public Queen() {
		weaponBehavior = new KnifeBehavior();
	}

	@Override
	public void fight() {
		System.out.println("女王出场");
		
	}
}
