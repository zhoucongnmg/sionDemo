package net.sion.company.design.observer.o2;

/**
 * 统计数据公告板
 * @author liuqiang
 *
 */
public class StatisticsConditionDisplay implements Observer {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		//do something 经过一些算法 算出近一周平均值
		this.temperature = temperature + 2.1f;
		this.humidity = humidity + 1f;
		this.pressure = pressure + 0.5f;
		display();
	}
	@Override
	public void display() {
		System.out.println("我是统计数据公告板 temperature = " + temperature + "℃,"
				+ " humidity = " + humidity + "%, pressure = " + pressure + "Pa");
	}

}
