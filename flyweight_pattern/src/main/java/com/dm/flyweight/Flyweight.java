package com.dm.flyweight;

/**
 * @author Administrator
 * @version V1.0
 * @InterfaceName:Flyweight
 * @Description:抽象享元角色
 * @date 2019/12/11
 */
public interface Flyweight {

    public void operation(UnsharedConcreteFlyweight state);
}
