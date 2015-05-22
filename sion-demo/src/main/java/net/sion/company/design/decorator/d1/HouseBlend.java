package net.sion.company.design.decorator.d1;

public class HouseBlend extends Beverage {

	@Override
	public String getDescription() {
		String des = "house 口味";
		return des;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 5.0;
	}

}
