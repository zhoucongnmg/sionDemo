package net.sion.company.design.template.d;

public class BlackCoffee extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("冲泡黑咖啡");
	}

	@Override
	void addCondiments() {
		System.out.println("放糖");
	}
	
	public boolean wantPourInCup() {
		return false;
	}

}
