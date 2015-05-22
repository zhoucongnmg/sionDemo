package net.sion.company.design.observer.o2;

public interface Observer {
	void update(float temp, float humidity, float pressure);
	void display();
}
