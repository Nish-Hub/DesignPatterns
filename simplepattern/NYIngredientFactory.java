package com.coding.designpattern.simplepattern;

public class NYIngredientFactory implements IngredientFactory{

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new Sauce();
		
	}

	@Override
	public Crust createCrust() {
		// TODO Auto-generated method stub
		return new Crust();
		
	}

}
