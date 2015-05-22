package net.sion.company.design.factory;

import net.sion.company.design.factory.f1.CheesePizza;
import net.sion.company.design.factory.f1.GreekPizza;
import net.sion.company.design.factory.f1.PepperoniPizza;
import net.sion.company.design.factory.f1.Pizza;
import net.sion.company.design.factory.f1.SimplePizzaFactory;
import net.sion.company.design.factory.f2.PizzaFactory;
import net.sion.company.design.factory.f3.AbsPizzaStore;
import net.sion.company.design.factory.f3.ChiPizzaStore;
import net.sion.company.design.factory.f3.NyPizzaStore;


public class PizzaStore {
	
	public PizzaStore getInstance() {
		return new PizzaStore();
	}
	
	
	public PizzaStore() {
	}
	
	
	PizzaFactory pizzaFactory;
	
	SimplePizzaFactory factory;


	public void setPizzaFactory(PizzaFactory pizzaFactory) {
		this.pizzaFactory = pizzaFactory;
	}

	public void setFactory(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public static void main(String[] args) {
		PizzaStore o = new PizzaStore();
		o.test1("cheese");
		o.test2("greek");
		o.test3("cheese");
	}
	
	public void test1(String type) {
		System.out.println("我是test1....");
		Pizza pizza = null;
		if (type.equals("cheese")) {//奶酪
			pizza = new CheesePizza();
		} else if (type.equals("greek")) {
			pizza = new GreekPizza();
		} else if (type.equals("pepperoni")) {//意大利辣香肠
			pizza = new PepperoniPizza();
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		System.out.println("我是test1 end....");
	}
	
	public void test2(String type) {
		System.out.println("我是test2....");
		Pizza pizza = null;
		if (type.equals("cheese")) {//奶酪
			pizza = new CheesePizza();
		} else if (type.equals("greek")) {
			pizza = new GreekPizza();
		} else if (type.equals("pepperoni")) {//意大利辣香肠
			pizza = new PepperoniPizza();
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		//pizza.box();
		System.out.println("我是test2 end....");
	}
	
	public void test3(String type) {
		System.out.println("我是test3....");
		
		SimplePizzaFactory factory = new SimplePizzaFactory();
		Pizza pizza = factory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		System.out.println("我是test3 end....");
	}

	public <T>void test4(Class<T> cls, String type) {
		System.out.println("我是test4....");
		PizzaFactory factory = null;
		try {
			factory = (PizzaFactory) cls.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Pizza pizza = factory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		System.out.println("我是test4 end....");
	}
	
	public void test5(String type) {
		AbsPizzaStore nyStore = new NyPizzaStore();
		nyStore.orderPizza(type);
		
		AbsPizzaStore chiStore = new ChiPizzaStore();
		chiStore.orderPizza(type);
	}
	

}
