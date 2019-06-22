package com.dm.simple;

public class FoodFactory {
	
	public static Food produceFood(String food) {
		switch (food) {
		case "�׷�":
			return new Rice_s();
		case "����":
			return new Chicken_s();
		case "���":
			return new Bread_s();
		default:
			throw new RuntimeException("û��ʳ��");
		}
	}
}
