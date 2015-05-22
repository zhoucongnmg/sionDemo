package net.sion.company.design.demo1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) throws Exception {
		Demo demo = new Demo();
		demo.born();
		List<Person> pl = new ArrayList<Person>();
		List<Person> pl1 = new LinkedList<Person>();
		demo.print(pl);
	}
	/**
	 * 出生
	 */
	private void born() {
		Person p1 = new Person();
		p1.setAge("1");
		p1.setCountry("中国");
		p1.setName("张三");
		p1.setSex("男");
		
		Person p2 = new Person();
		p2.setAge("1");
		p2.setCountry("中国");
		p2.setName("李四");
		p2.setSex("女");
	}
	
	/**
	 * 出生
	 */
	private void newborn() {
		Person p1 = getP();
		p1.setName("张三");
		p1.setSex("男");
		
		Person p2 = getP();
		p2.setName("李四");
		p2.setSex("女");

	}
	
	private Person getP() {
		Person p = new Person();
		p.setAge("1");
		p.setCountry("中国");
		return p;
	}
	
	private void print(List<Person> pl) {
		for (Person p : pl) {
			System.out.println(p);
		}
	}
}
