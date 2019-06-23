package com.dm.method;

public class RiceFactory implements FoodFactory {

	@Override
	public Food_M produceFood() {
		return new Rice_M();
	}

}
