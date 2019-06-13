package com.study.design.mode.head.assignment.strategy;

/**
 * 	角色类
 * @author pc
 *
 */
public abstract class Character {
	
	WeaponBehavior weaponBehavior;
	
	public void preformWeaponBehavior() {
		weaponBehavior.useWeapon();
	}
	
	public void setWeaponBehavior(WeaponBehavior wb) {
		weaponBehavior = wb;
	}
	//战斗方法
	public abstract void fight();

}
