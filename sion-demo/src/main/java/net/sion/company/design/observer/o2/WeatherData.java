package net.sion.company.design.observer.o2;

import java.util.ArrayList;
import java.util.List;

import net.sion.company.design.observer.o1.DataBean;

public class WeatherData implements Subject {

	
	private List<Observer> observers;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer o : observers) {
			o.update(db.getTemperature(), db.getHumidity(), db.getPressure());
		}
	}
	
	private DataBean db;
	
	public void init(DataBean db) {
		this.db = db;
	}
	
	public void dataChange() {
		notifyObservers();
	}
	
	
	
}
