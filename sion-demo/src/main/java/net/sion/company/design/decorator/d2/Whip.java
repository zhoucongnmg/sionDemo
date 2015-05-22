package net.sion.company.design.decorator.d2;

import net.sion.company.design.decorator.d1.Beverage;



public class Whip extends CondimentDecorator {

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return 3.5 + beverage.cost();
	}

}
