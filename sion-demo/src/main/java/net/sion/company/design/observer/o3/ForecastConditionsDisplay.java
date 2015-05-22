package net.sion.company.design.observer.o3;

import java.util.Observable;

import net.sion.company.design.observer.o1.DataBean;

/**
 * 预测数据公告板
 * @author liuqiang
 *
 */
public class ForecastConditionsDisplay implements DecorInterface {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	@Override
	public void update(Observable o, Object arg) {
		//do something 经过一些算法 预测数据
		DataBean db = (DataBean) arg;
		this.temperature = db.getTemperature() + 2;
		this.humidity = db.getHumidity() - 3f;
		this.pressure = db.getPressure() + 1.5f;
		display();
	}

	@Override
	public void display() {
		System.out.println("我是一周平均数据公告板 temperature = " + temperature + "℃,"
				+ " humidity = " + humidity + "%, pressure = " + pressure + "Pa");
	}

}
