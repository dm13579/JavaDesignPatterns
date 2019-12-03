package com.dm.build1;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Direct
 * @Description:指挥者
 * @date 2019/12/3
 */
public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Product construct()
    {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }

}
