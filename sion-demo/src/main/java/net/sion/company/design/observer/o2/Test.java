package net.sion.company.design.observer.o2;

import net.sion.company.design.observer.o1.DataBean;

public class Test {
	
	public static void main(String[] args) {
		Test test = new Test();
		test.runTest();
	}
	
	public void runTest() {
		WeatherData wd = new WeatherData();
		DataBean db = new DataBean();
		db.setTemperature(10);
		db.setHumidity(80);
		db.setPressure(3002.10f);
		wd.init(db);
		register(wd);
		wd.dataChange();
	}
	
	private void register(WeatherData wd) {
		DisplayFactory factory = new DisplayFactory();
		
		Observer currentDisplay = factory.getInstance("current");
		wd.registerObserver(currentDisplay);
		
		Observer forecastDisplay = factory.getInstance("forecast");
		wd.registerObserver(forecastDisplay);
		
		Observer statiDisplay = factory.getInstance("stati");
		wd.registerObserver(statiDisplay);
	}
}
