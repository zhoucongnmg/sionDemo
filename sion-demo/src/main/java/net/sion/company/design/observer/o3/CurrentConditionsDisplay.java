package net.sion.company.design.observer.o3;

import java.util.Observable;
import net.sion.company.design.observer.o1.DataBean;

/**
 * 实时数据公告板
 * @author liuqiang
 *
 */
public class CurrentConditionsDisplay implements DecorInterface {
	
	private float temperature;
	private float humidity;
	private float pressure;
	Observable obs;

	@Override
	public void display() {
		System.out.println("我是实时数据公告板 temperature = " + temperature + "℃,"
				+ " humidity = " + humidity + "%, pressure = " + pressure + "Pa");
	}
	@Override
	public void update(Observable o, Object arg) {
		DataBean db = (DataBean) arg;
		this.temperature = db.getTemperature();
		this.humidity = db.getHumidity();
		this.pressure = db.getPressure();
		display();
	}

}
