package com.dm.simple;

public class FoodFactory {
	
	public static Food produceFood(String food) {
		switch (food) {
		case "米饭":
			return new Rice_s();
		case "鸡肉":
			return new Chicken_s();
		case "面包":
			return new Bread_s();
		default:
			throw new RuntimeException("没啦");
		}
	}
}


