package net.sion.company.design.template;

public class Coffee {
	/**
	 * 煮咖啡
	 */
	void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}
	
	
	public void boilWater() {
		System.out.println("把水煮沸");
	}
	
	public void brewCoffeeGrinds() {
		System.out.println("冲泡咖啡");
	}
	
	public void pourInCup() {
		System.out.println("倒入杯中");
	}
	
	public void addSugarAndMilk() {
		System.out.println("加入牛奶和糖");
	}
}
