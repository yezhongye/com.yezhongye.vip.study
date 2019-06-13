package com.study.design.mode.head.assignment.strategy;

/**
 * 	宝剑行为
 * @author pc
 *
 */
public class SwordBehavior implements WeaponBehavior{

	@Override
	public void useWeapon() {
		System.out.println("使用宝剑挥舞");
		
	}

}
