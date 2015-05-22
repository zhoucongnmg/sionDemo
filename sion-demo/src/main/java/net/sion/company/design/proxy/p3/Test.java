package net.sion.company.design.proxy.p3;

public class Test {
	public static void main(String[] args) {
		IService service = LogProxy.newProxy(ServiceImpl.class);
		
		//此方法将会被拦截
		service.save();  

		service.query();
	}
}
