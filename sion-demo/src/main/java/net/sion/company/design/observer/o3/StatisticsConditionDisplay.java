package net.sion.company.design.observer.o3;

import java.util.Observable;

import net.sion.company.design.observer.o1.DataBean;

/**
 * 统计数据公告板
 * @author liuqiang
 *
 */
public class StatisticsConditionDisplay implements DecorInterface {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	@Override
	public void update(Observable o, Object arg) {
		//do something 经过一些算法 算出近一周平均值
		DataBean db = (DataBean) arg;
		this.temperature = db.getTemperature() + 2.1f;
		this.humidity = db.getHumidity() + 1f;
		this.pressure = db.getPressure() + 0.5f;	
		display();
	}

	@Override
	public void display() {
		System.out.println("我是统计数据公告板 temperature = " + temperature + "℃,"
				+ " humidity = " + humidity + "%, pressure = " + pressure + "Pa");
	}

}
