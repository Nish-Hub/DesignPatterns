package com.coding.designpattern.Singleton;

public class ThreadClass implements Runnable{
	String name;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		SingletonDoubleCheckClass sc=SingletonDoubleCheckClass.getInstance();
		sc.name="thread "+name;
		System.out.println("thread with name "+sc.name+" created "+sc);
		
	}

}
