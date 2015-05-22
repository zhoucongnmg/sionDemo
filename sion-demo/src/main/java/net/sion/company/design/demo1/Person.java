package net.sion.company.design.demo1;

public class Person {
	private String name;
	private String age;
	private String sex;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", country=" + country + "]";
	}
	
}
