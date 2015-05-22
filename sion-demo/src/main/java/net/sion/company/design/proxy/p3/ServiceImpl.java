package net.sion.company.design.proxy.p3;

public class ServiceImpl implements IService {

	@Override
	public void save() {
		System.out.println("我的保存操作");
	}

	@Override
	public void query() {
		System.out.println("我的查询操作");
	}

}
