package net.sion.company.design.adapter.a1;


public class Test {
	
	private PersonFactory pf = new PersonFactory();
	
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.test("chinese");
		
		Test t2 = new Test();
		t2.test("american");
		
		Test t3 = new Test();
		t3.test("jp");
	}
	
	public void test(String country) {
		Person person = pf.getPerson(country);
		person.say();
		person.named();
		person.culture();
	}
}
