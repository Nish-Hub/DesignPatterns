package com.coding.designpattern.Singleton;

public class SingletonClassEagerInitializer {
	private static SingletonClassEagerInitializer sc = null;
	static {
	//	static SingletonClassEagerInitializer sc = new SingletonClassEagerInitializer(); // note : doesnt give multiple declarations error !!! because
		// this is considered a local variable , if we make it static , then it starts throwing error 
		sc = new SingletonClassEagerInitializer();
	}
	
	public String name;

	private SingletonClassEagerInitializer() {
		System.out.println("Private constructor of singleton class");
	}

	public static SingletonClassEagerInitializer getInstance() {
		return sc;
	}
}
