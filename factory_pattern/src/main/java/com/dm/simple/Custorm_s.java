package com.dm.simple;

public class Custorm_s {
	
	public static void main(String[] args) {
		FoodFactory.produceFood("米饭").eat();
		FoodFactory.produceFood("面包").eat();
		FoodFactory.produceFood("鸡肉").eat();
	}
}
