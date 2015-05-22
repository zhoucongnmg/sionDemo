package net.sion.company.design.proxy.p3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogProxy implements InvocationHandler {
	
	private Object obj;
    private LogProxy(Object obj) {
       this.obj = obj;
    }
	
    @SuppressWarnings("unchecked")
	public static <T>T newProxy(Class<T> cls) {
    	Object o = null;
    	try {
    		o = cls.newInstance();
    	} catch(Exception e) {
    		throw new RuntimeException(e.getMessage(),e);
    	}
    	Object proxy = Proxy.newProxyInstance(LogProxy.class.getClassLoader(),
    				o.getClass().getInterfaces(),
    				new LogProxy(o));
    	return (T) proxy;
    }
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object res = null;
		if (method.isAnnotationPresent(Log.class)) {//判断是否添加了Tx事务注解
			try {
				System.out.println("开始拦截...");
				Long startTime = System.currentTimeMillis();
				
				Thread.sleep(3000);
				
				res = method.invoke(this.obj, args);
				Long endTime = System.currentTimeMillis();
				System.out.println("总用时 == " + (endTime - startTime));
				System.out.println("拦截完成提交");
			} catch(Exception e) {
				System.out.println("回滚");
				throw new RuntimeException(e.getMessage(),e);
	        } finally {
	            System.out.println("结束....");
	        }
		} else {
			res = method.invoke(this.obj, args);
		}
		return res;
	}

}
