package com.dm.build.burger;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:VegBurger
 * @Description:TODO
 * @date 2019/12/3
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 30f;
    }
}
