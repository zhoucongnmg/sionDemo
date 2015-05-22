package net.sion.company.design.factory.f3;

import net.sion.company.design.factory.f1.CheesePizza;
import net.sion.company.design.factory.f1.GreekPizza;
import net.sion.company.design.factory.f1.PepperoniPizza;
import net.sion.company.design.factory.f1.Pizza;


public class NyPizzaStore extends AbsPizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {//奶酪
			pizza = new CheesePizza();
		} else if (type.equals("greek")) {
			pizza = new GreekPizza();
		} else if (type.equals("pepperoni")) {//意大利辣香肠
			pizza = new PepperoniPizza();
		}
		System.out.println("我来自纽约店 ny pizza store");
		return pizza;
	}

}
