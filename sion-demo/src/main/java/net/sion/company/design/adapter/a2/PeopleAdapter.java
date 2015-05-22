package net.sion.company.design.adapter.a2;

import net.sion.company.design.adapter.a1.Person;


public class PeopleAdapter implements Person {

	private People people = null;
	
	public PeopleAdapter(People people) {
		this.people = people;
	}
	
	@Override
	public void say() {
		people.talk();
	}

	@Override
	public void named() {
		people.named();
	}

	@Override
	public void culture() {
		people.culture();
	}

}
