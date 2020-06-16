package com.dm.abstr;

public class AodFactory implements CarFactory {

	@Override
	public Trunk_A produceTrunk() {
		
		return new AodTrunk_A();
	}

	@Override
	public Sedan_A produceSedan() {
		
		return new AodSedan_A();
	}

}
