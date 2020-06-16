package com.dm.build.colddrink;

import com.dm.build.pack.Bottle;
import com.dm.build.base.Item;
import com.dm.build.base.Packing;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Burger
 * @Description:抽象冷饮类
 * @date 2019/12/3
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
