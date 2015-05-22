package net.sion.company.design.decorator.d2;

import net.sion.company.design.decorator.d1.Beverage;



public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return 0.5 + beverage.cost();
	}

}
