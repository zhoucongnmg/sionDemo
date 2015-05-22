package net.sion.company.design.factory.f1;

public class PepperoniPizza implements Pizza {

	public void prepare() {
		System.out.println("Pepperoni prepare");
	}

	public void bake() {
		System.out.println("Pepperoni bake");
	}

	public void cut() {
		System.out.println("Pepperoni cut");
	}

	public void box() {
		System.out.println("Pepperoni box");
	}

}
