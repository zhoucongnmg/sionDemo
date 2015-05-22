package net.sion.company.design.proxy.p2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

	private Object object;  
    public DynamicProxy(Object object) {  
        this.object = object;  
    }  
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("----准备教案-----");  
        
        //我们可以再代理方法调用前后添加功能  
        Object result = method.invoke(object, args);  
          
        System.out.println("----留作业-----");  
        return result;  
	}

}
