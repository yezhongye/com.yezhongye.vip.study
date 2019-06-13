package com.study.design.mode.head.assignment.strategy;

/**
 * 	国王
 * @author pc
 *
 */
public class King extends Character{
	
	public King(){
		weaponBehavior = new SwordBehavior();
	}

	@Override
	public void fight() {
		System.out.println("国王出场");
	}
}
