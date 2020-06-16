package com.dm.single;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:HungrymanSingleton
 * @Description:TODO 单例模式饿汉模式
 * @date 2019/12/2
 */
public class HungrymanSingleton {

    private static final HungrymanSingleton INSTANCE = new HungrymanSingleton();

    private HungrymanSingleton(){

    }

    public static HungrymanSingleton getInstance(){
        return INSTANCE;
    }
}
