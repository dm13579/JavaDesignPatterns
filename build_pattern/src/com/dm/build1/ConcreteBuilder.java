package com.dm.build1;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:ConcreteBuilder
 * @Description:TODO
 * @date 2019/12/3
 */
public class ConcreteBuilder extends Builder{
    @Override
    public void buildPartA() {
        product.setPartA("建造A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造C");
    }
}
