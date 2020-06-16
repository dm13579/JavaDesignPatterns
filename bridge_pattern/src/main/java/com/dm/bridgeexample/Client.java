package com.dm.bridgeexample;

import com.dm.bridgeexample.bag.HandBag;
import com.dm.bridgeexample.color.Color;
import com.dm.bridgeexample.color.Yellow;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Client
 * @Description:TODO
 * @date 2019/12/4
 */
public class Client {
    public static void main(String[] args) {
        Color color = new Yellow();
        HandBag handBag = new HandBag(color);
        System.out.println(handBag.getName());
    }
}
