package com.dm.build;

import com.dm.build.burger.ChickenBurger;
import com.dm.build.burger.VegBurger;
import com.dm.build.colddrink.Coke;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:MealBuilder
 * @Description:TODO
 * @date 2019/12/3
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
