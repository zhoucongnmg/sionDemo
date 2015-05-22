package net.sion.company.design.factory.f1;
/**
 * 创建Pizza的工厂
 * @author liuqiang
 *
 */
public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {//奶酪
			pizza = new CheesePizza();
		} else if (type.equals("greek")) {
			pizza = new GreekPizza();
		} else if (type.equals("pepperoni")) {//意大利辣香肠
			pizza = new PepperoniPizza();
		}
		return pizza;
	}
}
