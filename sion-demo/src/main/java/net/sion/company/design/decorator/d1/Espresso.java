package net.sion.company.design.decorator.d1;

public class Espresso extends Beverage {

	@Override
	public String getDescription() {
		String des = "Espresso 口味";
		return des;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 4.7;
	}

}
