package com.study.design.mode.head.assignment.strategy;

/**
 * 	匕首行为
 * @author pc
 *
 */
public class KnifeBehavior implements WeaponBehavior{

	//实现用匕首刺杀
	@Override
	public void useWeapon() {
		System.out.println("使用匕首刺杀");
		
	}

}
