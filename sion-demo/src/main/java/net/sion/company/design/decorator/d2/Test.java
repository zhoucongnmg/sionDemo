package net.sion.company.design.decorator.d2;

import net.sion.company.design.decorator.d1.Beverage;
import net.sion.company.design.decorator.d1.DarkRoast;
import net.sion.company.design.decorator.d1.Espresso;


public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		test.runTest();
	}
	
	public void runTest() {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " ￥" + beverage.cost());
		
		Beverage beverage1 = new DarkRoast();
		beverage1 = new Mocha(beverage1);
		beverage1 = new Mocha(beverage1);
		beverage1 = new Whip(beverage1);
		System.out.println(beverage1.getDescription() + " ￥" + beverage1.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(new Mocha(new Mocha(new Whip(beverage2))));

		System.out.println(beverage2.getDescription() + " ￥" + beverage2.cost());
	}
}
