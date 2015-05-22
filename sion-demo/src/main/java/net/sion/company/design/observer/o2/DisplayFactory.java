package net.sion.company.design.observer.o2;


public class DisplayFactory {
	public Observer getInstance(String type) {
		Observer display = null;
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
