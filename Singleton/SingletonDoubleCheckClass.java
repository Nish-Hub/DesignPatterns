package com.coding.designpattern.Singleton;

public class SingletonDoubleCheckClass {
	private volatile static SingletonDoubleCheckClass sc = null;

	/* volatile solves one issue that is visibility issue . If you are writing to one variable that is declared volatile
	 *  then the value will be visible to other thread immediately. As we all know we have different level of cache in
	 *   os L1, L2, L3 and if we write to a variable in one thread it is not guaranteed to be visible to other, so if we
	 *    use volatile it writes to direct memory and is visible to others. But volatile does not solve the issue of 
	 *    atomicity 
	 * i.e. int a; a++; is not safe. AS there are three machine instructions associated to it.*/
	
	public String name;

	private SingletonDoubleCheckClass() {
		System.out.println("Private constructor of SingletonDoubleCheckClass class");
	}

	public static SingletonDoubleCheckClass getInstance() {
		if(sc==null)
		{ System.out.println("sc is null as said by "+sc);
			synchronized(SingletonDoubleCheckClass.class)
			{  System.out.println("inside synchronized : instantiating the class");
				if(sc==null)
				{
					System.out.println("sc is null as said by "+sc);	
				sc=new SingletonDoubleCheckClass();
				}
			}
		}
		return sc;
	}
}
