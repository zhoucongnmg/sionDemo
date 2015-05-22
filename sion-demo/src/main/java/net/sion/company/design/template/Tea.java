package net.sion.company.design.template;

public class Tea {
	/**
	 * 泡茶
	 */
	void prepareRecipe() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}

	public void boilWater() {
		System.out.println("把水煮沸");
	}
	
	public void steepTeaBag() {
		System.out.println("泡茶叶");
	}
	
	public void pourInCup() {
		System.out.println("倒入杯中");
	}
	
	public void addLemon() {
		System.out.println("加入柠檬");
	}
}
