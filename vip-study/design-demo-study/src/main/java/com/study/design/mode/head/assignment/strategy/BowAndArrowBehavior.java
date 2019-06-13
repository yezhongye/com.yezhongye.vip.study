package com.study.design.mode.head.assignment.strategy;

/**
 * 	弓箭行为
 * @author pc
 *
 */
public class BowAndArrowBehavior implements WeaponBehavior{

	@Override
	public void useWeapon() {
		
		System.out.println("使用弓箭射击");
		
	}

}
