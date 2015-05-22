package net.sion.company.design.template.d;

public class Coffee extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("冲泡咖啡");
	}
	
	@Override
	void addCondiments() {
		System.out.println("加入牛奶和糖");
	}
}
