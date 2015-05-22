package net.sion.company.design.proxy.p1;

public class ProxyObject implements Subject {

	private Subject object;  
    public ProxyObject(Subject object) {  
        this.object = object;  
    }  
	
	@Override
	public void dosomething() {
		System.out.println("----准备教案-----");
		object.dosomething();
		System.out.println("-------留作业------");
	}

}
