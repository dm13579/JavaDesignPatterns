package com.dm.abstr;

public class BmaFactory implements CarFactory {

	@Override
	public Trunk_A produceTrunk() {
		
		return new BmaTrunk_A();
	}

	@Override
	public Sedan_A produceSedan() {
		
		return new BmaSedan_A();
	}

}
