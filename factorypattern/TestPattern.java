package com.coding.designpattern.factorypattern;

public class TestPattern {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	AnimalCreator ac=new AnimalCreator();
//	System.out.println(ac.createObject("com.coding.designpattern.factorypattern.Cat"));
	Cat c=(Cat) ac.createObject("com.coding.designpattern.factorypattern.Cat");
	System.out.println(c);
}
}
