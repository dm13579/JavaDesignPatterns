package com.dm.bridgeexample.bag;

import com.dm.bridgeexample.color.Color;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Bag
 * @Description:TODO
 * @date 2019/12/4
 */
public abstract class Bag {

    protected Color color;

    public Bag(Color color) {
        this.color = color;
    }

    public abstract String getName();
}
