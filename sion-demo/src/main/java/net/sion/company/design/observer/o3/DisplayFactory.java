package net.sion.company.design.observer.o3;


public class DisplayFactory {
	public DecorInterface getInstance(String type) {
		DecorInterface display = null;
		if (type.equals("current")) {//
			display = new CurrentConditionsDisplay();
		} else if (type.equals("forecast")) {
			display = new ForecastConditionsDisplay();
		} else if (type.equals("stati")) {
			display = new StatisticsConditionDisplay();
		}
		return display;
	}
}
