package net.sion.company.design.observer.o1;

/**
 * 实时数据公告板
 * @author liuqiang
 *
 */
public class CurrentConditionsDisplay implements Display {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
	@Override
	public void display() {
		System.out.println("我是实时数据公告板 temperature = " + temperature + "℃,"
				+ " humidity = " + humidity + "%, pressure = " + pressure + "Pa");
	}

}
