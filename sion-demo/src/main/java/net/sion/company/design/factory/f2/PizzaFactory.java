package net.sion.company.design.factory.f2;

import net.sion.company.design.factory.f1.Pizza;

public interface PizzaFactory {
	Pizza createPizza(String type);
}
