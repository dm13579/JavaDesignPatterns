package com.dm.flyweight;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:client
 * @Description:客户端
 * @date 2019/12/10
 */
public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight01 = factory.getFlyweight("a");
        Flyweight flyweight02 = factory.getFlyweight("a");
        Flyweight flyweight03 = factory.getFlyweight("a");
        Flyweight flyweight04 = factory.getFlyweight("b");
        Flyweight flyweight05 = factory.getFlyweight("b");

        flyweight01.operation(new UnsharedConcreteFlyweight("第一次调用a"));
        flyweight02.operation(new UnsharedConcreteFlyweight("第二次调用a"));
        flyweight03.operation(new UnsharedConcreteFlyweight("第三次调用a"));
        flyweight04.operation(new UnsharedConcreteFlyweight("第一次调用b"));
        flyweight05.operation(new UnsharedConcreteFlyweight("第二次调用b"));

    }
}
