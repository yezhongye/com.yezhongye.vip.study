package com.study.design.mode.pattern;

import org.junit.Test;

import com.study.design.mode.head.assignment.strategy.BowAndArrowBehavior;
import com.study.design.mode.head.assignment.strategy.Character;
import com.study.design.mode.head.assignment.strategy.King;
import com.study.design.mode.head.assignment.strategy.KnifeBehavior;
import com.study.design.mode.head.assignment.strategy.Knight;
import com.study.design.mode.head.assignment.strategy.Queen;
import com.study.design.mode.head.assignment.strategy.Troll;
import com.study.design.mode.head.first.MallardDuck;
import com.study.design.mode.head.strategy.Duck;

public class StrategyPatternTest {

	@Test
	public void strategyPatternStudyTest() {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
	}
	
	@Test
	public void strategyPatternAssignmentTest() {
		Character king = new King();
		king.fight();
		king.preformWeaponBehavior();
		king.setWeaponBehavior(new BowAndArrowBehavior());

		System.out.println("国王切换武器成功");
		king.preformWeaponBehavior();
		
		Character queen = new Queen();
		queen.fight();
		queen.preformWeaponBehavior();
		
		Character troll = new Troll();
		troll.fight();
		troll.preformWeaponBehavior();
		
		Character knight = new Knight();
		knight.fight();
		knight.preformWeaponBehavior();
		knight.setWeaponBehavior(new KnifeBehavior());
		knight.preformWeaponBehavior();
	}
}
