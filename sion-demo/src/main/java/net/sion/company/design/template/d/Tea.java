package net.sion.company.design.template.d;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("泡茶叶");
	}

	@Override
	void addCondiments() {
		System.out.println("加入柠檬");
	}
}
