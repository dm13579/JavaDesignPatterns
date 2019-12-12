package com.dm.strategy;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Context
 * @Description:环境类
 * @date 2019/12/2
 */
public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod(){
        strategy.strategyMethod();
    }
}
