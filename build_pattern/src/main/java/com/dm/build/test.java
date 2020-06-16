package com.dm.build;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:test
 * @Description:TODO
 * @date 2019/12/3
 */
public class test {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal vegMeal = builder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("cost:"+vegMeal.getCost());

        MealBuilder builder1 = new MealBuilder();
        Meal nonvegMeal = builder1.prepareNonVegMeal();
        nonvegMeal.showItems();
        System.out.println("cost:"+nonvegMeal.getCost());
    }
}

