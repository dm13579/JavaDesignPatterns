package com.dm.method;

public class ChickenFactory implements FoodFactory {

	@Override
	public Food_M produceFood() {
		return new Chicken_M();	
	}

}
