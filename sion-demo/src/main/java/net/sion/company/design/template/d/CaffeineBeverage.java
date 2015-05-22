/**
 * 
 */
package net.sion.company.design.template.d;

/**
 * @author liuqiang
 *
 */
public abstract class CaffeineBeverage {
/*
	public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
*/

	public void prepareRecipe() {
		boilWater();
		brew();
		if (wantPourInCup()) {
			pourInCup();
		}
		addCondiments();
	}

	public void boilWater() {
		System.out.println("把水煮沸");
	}
	
	public void pourInCup() {
		System.out.println("倒入杯中");
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	public boolean wantPourInCup() {
		return true;
	}
	
}
