package com.dm.strategy;

import com.dm.strategy.concretestrategy.ContextStrategy1;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Client
 * @Description:TODO
 * @date 2019/12/12
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategy1 = new ContextStrategy1();
        context.setStrategy(strategy1);
        context.strategyMethod();
    }
}
