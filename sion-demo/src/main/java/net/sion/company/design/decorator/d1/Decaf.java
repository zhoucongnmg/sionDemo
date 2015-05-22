package net.sion.company.design.decorator.d1;

public class Decaf extends Beverage {

	@Override
	public String getDescription() {
		String des = "Decaf 口味";
		return des;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 4.5;
	}

}
