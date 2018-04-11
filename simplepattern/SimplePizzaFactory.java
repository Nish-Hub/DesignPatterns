package com.coding.designpattern.simplepattern;

import com.coding.designpattern.factorypattern.Cat;

public class SimplePizzaFactory {
static Pizza createPizza(String name) throws ClassNotFoundException
{
	ClassLoader c=CheesePizza.class.getClassLoader();
	//Class<?> cl=c.loadClass("com.coding.designpattern.factorypattern.Animal");  //Caused by: java.lang.NoSuchMethodException: 
	//com.coding.designpattern.factorypattern.Animal.<init>() -- default constructor missing in superclass
	Class<?> cl=c.loadClass(name);  //
	
	//return cl.newInstance();
	return null;
}
}
