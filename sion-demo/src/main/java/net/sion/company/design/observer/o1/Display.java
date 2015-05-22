package net.sion.company.design.observer.o1;

public interface Display {
	void update(float temperature, float humidity, float pressure);
	void display();
}
