package net.sion.company.design.proxy.p2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import net.sion.company.design.proxy.p1.MathSubject;
import net.sion.company.design.proxy.p1.Subject;

public class Test {
	public static void main(String[] args) {
		//创建目标对象，也就是被代理对象  
        MathSubject realSubject = new MathSubject();  
          
        //将目标对象交给代理  
        InvocationHandler handler = new DynamicProxy(realSubject);  
          
//      Class<?> proxyClass = Proxy.getProxyClass(Subject.class.getClassLoader()  
//              , new Class[]{Subject.class});  
//      Subject subject = (Subject)proxyClass.getConstructor(new Class[]{InvocationHandler.class})  
//              .newInstance(new Object[]{handler});  
          
        //返回代理对象，相当于上面两句  
        Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),  
                realSubject.getClass().getInterfaces(),  
                handler);  
          
        //叫代理对象去doSomething()，其实在代理对象中的doSomething()中还是会  
        //用handler来调用invoke(proxy, method, args) 参数proxy为调用者subject(this)，  
        //method为doSomething()，参数为方法要传入的参数，这里没有  
        subject.dosomething();  
	}
}
