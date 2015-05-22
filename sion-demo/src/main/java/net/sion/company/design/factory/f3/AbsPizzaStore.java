package net.sion.company.design.factory.f3;

import net.sion.company.design.factory.f1.Pizza;


public abstract class AbsPizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
}
