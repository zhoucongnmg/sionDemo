package net.sion.company.design.observer.o1;

public class DataBean {
	/**
	 * 温度
	 */
	private float temperature;
	/**
	 * 湿度
	 */
	private float humidity;
	/**
	 * 气压
	 */
	private float pressure;
	
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
}
