package com.dm.method;

public class BreadFactory implements FoodFactory {

	@Override
	public Food_M produceFood() {
		return new Bread_M();
	}

}
