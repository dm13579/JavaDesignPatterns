package com.dm.build.burger;

import com.dm.build.pack.Wrapper;
import com.dm.build.base.Item;
import com.dm.build.base.Packing;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Burger
 * @Description:抽象食物类
 * @date 2019/12/3
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
