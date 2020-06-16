package com.dm.build1;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Build
 * @Description: 抽象建造者
 * @date 2019/12/3
 */
public abstract class Builder {

    protected Product product=new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    public Product getResult()
    {
        return product;
    }

}
