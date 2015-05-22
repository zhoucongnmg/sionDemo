package net.sion.company.design.observer.o3;

import java.util.Observable;
import net.sion.company.design.observer.o1.DataBean;

public class WeatherData extends Observable {

	
	
	private DataBean db;
	
	public void init(DataBean db) {
		this.db = db;
	}
	
	public void dataChange() {
		setChanged();
		notifyObservers(db);
	}
	
	
	
}
