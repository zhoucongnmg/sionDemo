package net.sion.company.design.decorator.d1;

public class DarkRoast extends Beverage {

	@Override
	public String getDescription() {
		String des = "DarkRoast 口味";
		return des;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 4.0;
	}

}
