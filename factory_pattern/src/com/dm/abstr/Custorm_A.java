package com.dm.abstr;

public class Custorm_A {
	
	public static void main(String[] args) {
		BmaFactory bmaFactory = new BmaFactory();
		bmaFactory.produceTrunk().run();
		bmaFactory.produceSedan().run();
		AodFactory aodFactory = new AodFactory();
		aodFactory.produceTrunk().run();
		aodFactory.produceSedan().run();
	}
}
