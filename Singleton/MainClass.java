package com.coding.designpattern.Singleton;

public class MainClass {
	public static void main(String[] args) {
	//	SingletonClass sc = new SingletonClass(); now that we have made the constructor private so no one can instantiate the class
		SingletonClass sc =SingletonClass.getInstance(); // we are now trying to instantiate the singleton class in an attempt to bring the logic of creation of the creation of the number of objects to the singleton class
		// note we made the mathod static as in this class MainClass, we cannot instantiate the Singleton class hence we need to make it static
		int count=1;
		for (int i = 0; i < 10; i++) {
	//		SingletonClass sc1 = new SingletonClass();
			SingletonClass sc1 =SingletonClass.getInstance();
			if(sc1.hashCode()==sc.hashCode())
			{
				System.out.println("reference are same ");
			}else if(sc1.hashCode()!=sc.hashCode())
			{
				System.out.println("reference are not same ");
				count++;
				System.out.println("count incremented to "+count);
			}
		}
		System.out.println("final value of count is "+count);
	}
}
