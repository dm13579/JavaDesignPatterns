package com.dm.decorator;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:client
 * @Description:TODO
 * @date 2019/12/10
 */
public class client {
    public static void main(String[] args) {
        Component concreteComponent = new ConcreteComponent();
        concreteComponent.operation();
        System.out.println("=================================");
        Component concreteDecorator = new ConcreteDecorator(concreteComponent);
        concreteDecorator.operation();
    }
}
