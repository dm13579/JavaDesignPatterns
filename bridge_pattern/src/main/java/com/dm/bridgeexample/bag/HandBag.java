package com.dm.bridgeexample.bag;

import com.dm.bridgeexample.color.Color;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:HandBag
 * @Description:TODO
 * @date 2019/12/4
 */
public class HandBag extends Bag {

    public HandBag(Color color) {
        super(color);
    }

    @Override
    public String getName() {
        return color.getColor()+"手包";
    }
}
