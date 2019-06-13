package com.study.design.mode.head.assignment.strategy;

/**
 * 	斧头行为
 * @author pc
 *
 */
public class AxeBehavior implements WeaponBehavior{

	@Override
	public void useWeapon() {
		System.out.println("使用斧头砍劈");
		
	}

}
