package net.sion.company.design.factory.f1;

public class GreekPizza implements Pizza {

	public void prepare() {
		System.out.println("greek prepare");
		
	}

	public void bake() {
		System.out.println("greek bake");
	}

	public void cut() {
		System.out.println("greek cut");
	}

	public void box() {
		System.out.println("greek box");
	}
}
