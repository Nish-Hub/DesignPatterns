package com.coding.designpattern.simplepattern;

public abstract class PizzaStore {
	SimplePizzaFactory sf=null;
public PizzaStore(SimplePizzaFactory sf)
{
	this.sf=sf;
}
public void orderPizza(String type)
{
	Pizza pi=createPizzas(type);  // invoking the factory to create the object
	pi.bake();
	pi.prepare();
	pi.serve();
}
public abstract Pizza  createPizzas(String type); // made this abstract so the concrete classes can implement this as they like
}
