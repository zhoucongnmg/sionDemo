package net.sion.company.design.single;

public class ThreadPool {
	static {
		
	}
	private final static ThreadPool tp = new ThreadPool();
	
	private ThreadPool() {
		
	}
	
	public static ThreadPool getInstance() {
		
		return tp;
	}
}
