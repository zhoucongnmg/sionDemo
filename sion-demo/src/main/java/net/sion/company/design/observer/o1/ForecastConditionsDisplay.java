package net.sion.company.design.observer.o1;

/**
 * 预测数据公告板
 * @author liuqiang
 *
 */
public class ForecastConditionsDisplay implements Display {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		//do something 经过一些算法 预测数据
		this.temperature = temperature + 2;
		this.humidity = humidity - 3f;
		this.pressure = pressure + 1.5f;
		display();
	}
	@Override
	public void display() {
		System.out.println("我是一周平均数据公告板 temperature = " + temperature + "℃,"
				+ " humidity = " + humidity + "%, pressure = " + pressure + "Pa");
	}

}
