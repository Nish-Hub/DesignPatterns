package com.coding.designpattern.factorypattern;

public class Cat extends Animal{
String name="Cat name";
int age=10;
public Cat() {
	// TODO Auto-generated constructor stub
	super("Cat name",10);  // Cannot refer to 'this' nor 'super' while explicitly invoking a constructor , Cannot refer to an instance field name while explicitly invoking a constructor
	// https://stackoverflow.com/questions/1625646/referring-to-this-while-invoking-super-constructor
}
public Cat(String name,int age) {
	// TODO Auto-generated constructor stub
	super(name,age);
	this.name=name;
	this.age=age;
}
//protected String toString()  // Cannot reduce the visibility of the inherited method from Object
public String toString()
{
	return "name of cat is "+name+" and has an age of "+age;
}
}
