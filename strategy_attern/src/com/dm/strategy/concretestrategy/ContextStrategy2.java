package com.dm.strategy.concretestrategy;

import com.dm.strategy.Strategy;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:ContextStrategy1
 * @Description:具体策略2
 * @date 2019/12/12
 */
public class ContextStrategy2 implements Strategy{

    @Override
    public void strategyMethod() {
        System.out.println("策略2");
    }
}
