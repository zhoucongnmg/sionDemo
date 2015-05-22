package net.sion.company.design.factory.f1;

public interface Pizza {
	/**
	 * 备料
	 */
	void prepare();
	/**
	 * 烘烤
	 */
	void bake();
	/**
	 * 切片
	 */
	void cut();
	/**
	 * 装盒
	 */
	void box();
}
