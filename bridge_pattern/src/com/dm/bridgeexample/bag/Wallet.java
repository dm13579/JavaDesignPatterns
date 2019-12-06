package com.dm.bridgeexample.bag;

import com.dm.bridgeexample.color.Color;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Wallet
 * @Description:TODO
 * @date 2019/12/4
 */
public class Wallet extends Bag {

    public Wallet(Color color) {
        super(color);
    }

    @Override
    public String getName() {
        return color.getColor()+"钱包";
    }
}
