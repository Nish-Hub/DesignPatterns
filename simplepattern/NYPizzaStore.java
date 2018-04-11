package com.coding.designpattern.simplepattern;

public class NYPizzaStore extends PizzaStore{
 // if we make a superclass having parameterised constructor , we have to make a parameterised call to the super constructor
	public NYPizzaStore(SimplePizzaFactory sf) {
		super(sf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pizza createPizzas(String type) {
		// TODO Auto-generated method stub
		System.out.println("we make a ny:: "+type+" stype pizza");
		Pizza pizza=null;
		IngredientFactory ingrafact=new NYIngredientFactory();
		if(type.equals("NYPizza"))
		{
			pizza=new NYPizza(ingrafact);
		}
		return pizza;
	}

}
