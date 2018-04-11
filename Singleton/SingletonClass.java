package com.coding.designpattern.Singleton;

public class SingletonClass {
	// static SingletonClass sc=new SingletonClass(); // this is static as its
	// returned from a static method
	// private static final SingletonClass sc=new SingletonClass(); // this is
	// static as its returned from a static method
	// the problem in declaring the above as final is it loads it at app startup
	private static SingletonClass sc;
	public String name;

	private SingletonClass() {
		System.out.println("Private constructor of singleton class");
	}

	public static synchronized SingletonClass getInstance() // we need to enforce some
												// condition on this , like some
												// global counter
	{
		//synchronized (sc) {
			if (sc == null) {
				sc = new SingletonClass();
			}
			return sc; // the instantiation is moved upwards just to make it
						// global like if one instance has already been made ,i
						// will need to hold this instance of Singleton to
						// compare with any new
			// newly constructed singletonclass instances just to check if
			// someone is trying to gt an instance , so should i return the old
			// or make a new one.
			// i prefer the final keyword as it enforces the Singleton class to
			// initialize the singleton class object at the start
		}
	//}
}
