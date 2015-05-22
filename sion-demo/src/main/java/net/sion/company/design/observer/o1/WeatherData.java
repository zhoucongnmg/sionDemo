package net.sion.company.design.observer.o1;

public class WeatherData {
	
	DisplayFactory factory = new DisplayFactory();
	
	private DataBean db;
	
	public void init(DataBean db) {
		this.db = db;
	}
	
	public void dataChange() {
		
		float temperature = db.getTemperature();
		float humidity = db.getHumidity();
		float pressure = db.getPressure();
		
		Display currentDisplay = factory.getInstance("current");
		currentDisplay.update(temperature, humidity, pressure);
		
		Display forecastDisplay = factory.getInstance("forecast");
		forecastDisplay.update(temperature, humidity, pressure);
		
		Display statiDisplay = factory.getInstance("stati");
		statiDisplay.update(temperature, humidity, pressure);
	}
	
	
	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		DataBean db = new DataBean();
		db.setTemperature(10);
		db.setHumidity(80);
		db.setPressure(3002.10f);
		wd.init(db);
		wd.dataChange();
	}

}
