package com.coding.designpattern.factorypattern;

public class AnimalCreator {
Object createObject(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException
{
	ClassLoader c=Cat.class.getClassLoader();
	//Class<?> cl=c.loadClass("com.coding.designpattern.factorypattern.Animal");  //Caused by: java.lang.NoSuchMethodException: 
	//com.coding.designpattern.factorypattern.Animal.<init>() -- default constructor missing in superclass
	Class<?> cl=c.loadClass(className);  //
	
	return cl.newInstance();
	
}
}
