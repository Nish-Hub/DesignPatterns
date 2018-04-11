package com.coding.designpattern.simplepattern;

public class ChicagoPizzaStore extends PizzaStore{

	public ChicagoPizzaStore(SimplePizzaFactory sf) {
		super(sf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pizza createPizzas(String type) { // a method of the parent class yet it makes an object of subclass type
		// TODO Auto-generated method stub
		System.out.println(" we make a chicago :: "+type+" based pizza");
		return new ChicagoPizza();
	}

}
