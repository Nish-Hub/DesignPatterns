package com.coding.designpattern.simplepattern;

public class NYPizza extends Pizza{
IngredientFactory ingrdFactory=null;

	public  NYPizza(IngredientFactory ingrdFactory) {
		// TODO Auto-generated constructor stub
		this.ingrdFactory=ingrdFactory;
	}
	@Override
	public void bake() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.crust=ingrdFactory.createCrust();
		super.sauce=ingrdFactory.createSauce();
	}

	@Override
	public void serve() {
		// TODO Auto-generated method stub
		
	}

}
