package net.sion.company.design.factory.f1;

public class CheesePizza implements Pizza {

	public void prepare() {
		System.out.println("cheese prepare");
		
	}

	public void bake() {
		System.out.println("cheese bake");
	}

	public void cut() {
		System.out.println("cheese cut");
	}

	public void box() {
		System.out.println("cheese box");
	}

}
