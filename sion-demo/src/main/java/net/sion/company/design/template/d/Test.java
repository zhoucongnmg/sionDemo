package net.sion.company.design.template.d;

public class Test {
	public static void main(String[] args) {
		System.out.println("======准备泡茶=======");
		CaffeineBeverage tea = new Tea();
		perform(tea);
		System.out.println("======准备咖啡=======");
		CaffeineBeverage coffee = new Coffee();
		perform(coffee);
		
		System.out.println("======准备黑咖啡=======");
		CaffeineBeverage black = new BlackCoffee();
		perform(black);
	}
	
	private static void perform(CaffeineBeverage caff) {
		caff.prepareRecipe();
	}
	
}
