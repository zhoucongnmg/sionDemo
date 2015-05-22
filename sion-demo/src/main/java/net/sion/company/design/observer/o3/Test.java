package net.sion.company.design.observer.o3;

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
		db.setHumidity(100);
		db.setPressure(3002.10f);
		wd.init(db);
		
		register(wd);
		
		wd.dataChange();
	}
	
	private void register(WeatherData wd) {
		DisplayFactory factory = new DisplayFactory();
		
		DecorInterface currentDisplay = factory.getInstance("current");
		wd.addObserver(currentDisplay);
		
		DecorInterface forecastDisplay = factory.getInstance("forecast");
		wd.addObserver(forecastDisplay);
		
		DecorInterface statiDisplay = factory.getInstance("stati");
		wd.addObserver(statiDisplay);
	}
}
