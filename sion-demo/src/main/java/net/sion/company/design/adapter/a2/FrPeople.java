package net.sion.company.design.adapter.a2;

public class FrPeople implements People {

	@Override
	public void talk() {
		System.out.println("我说法国话");
	}

	@Override
	public void named() {
		System.out.println("我起法国名");
	}

	@Override
	public void culture() {
		System.out.println("我们是法国文化");
	}

}
