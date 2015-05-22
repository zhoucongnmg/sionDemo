package net.sion.company.design.adapter.a2;

import net.sion.company.design.adapter.a1.AmericanPerson;
import net.sion.company.design.adapter.a1.ChinesePerson;
import net.sion.company.design.adapter.a1.JpPerson;
import net.sion.company.design.adapter.a1.Person;


public class PersonFactory {
	public Person getPerson(String type) {
		Person p = null;
		if (type.equals("chinese")) {
			p = new ChinesePerson();
		} else if (type.equals("american")) {
			p = new AmericanPerson();
		} else if (type.equals("jp")) {
			p = new JpPerson();
		} else if (type.equals("fr")) {
			People people = new FrPeople();
			p = new PeopleAdapter(people);
		}
		return p;
	}
}
