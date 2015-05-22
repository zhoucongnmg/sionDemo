package net.sion.company.design.adapter.a1;

public class PersonFactory {
	public Person getPerson(String type) {
		Person p = null;
		if (type.equals("chinese")) {
			p = new ChinesePerson();
		} else if (type.equals("american")) {
			p = new AmericanPerson();
		} else if (type.equals("jp")) {
			p = new JpPerson();
		}
		return p;
	}
}
