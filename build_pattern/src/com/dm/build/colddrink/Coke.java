package com.dm.build.colddrink;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:VegBurger
 * @Description:实现冷饮类-》coffe
 * @date 2019/12/3
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 10f;
    }
}
