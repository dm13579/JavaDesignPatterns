package com.dm.method;

public class Custorm_M {
	
	public static void main(String[] args) {
		RiceFactory rice = new RiceFactory();
		rice.produceFood().eat();
		BreadFactory bread = new BreadFactory();
		bread.produceFood().eat();
		ChickenFactory chicken = new ChickenFactory();
		chicken.produceFood().eat();
	}
}
