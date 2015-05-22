package net.sion.company.design.proxy.p1;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("=====不使用代理========");
		Subject subject = new MathSubject();
		subject.dosomething();
		System.out.println("============================");
		
		System.out.println("========使用代理========");
		Subject proxy = new ProxyObject(subject);
		proxy.dosomething();
		
		System.out.println("============================");
		Subject proxy1 = new ProxyObject(new PeSubject());
		proxy1.dosomething();
	}
}
