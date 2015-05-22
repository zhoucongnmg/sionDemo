package net.sion.company.design.template;

public class Test {
	public static void main(String[] args) {
		System.out.println("======准备泡茶=======");
		Tea tea = new Tea();
		perform(tea);
		System.out.println("======准备咖啡=======");
		Coffee coffee = new Coffee();
		perform(coffee);
	}
	
	private static void perform(Tea tea) {
		tea.prepareRecipe();
	}
	
	private static void perform(Coffee coffee) {
		coffee.prepareRecipe();
	}
}
