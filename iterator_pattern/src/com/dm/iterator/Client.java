package com.dm.iterator;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Client
 * @Description:迭代器模式
 * @date 2019/12/12
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("123");
        aggregate.add("456");
        aggregate.add("789");
        Iterator iterator = aggregate.getIterator();
        while(iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object.toString());
        }

        System.out.println("first:"+iterator.first().toString());
    }
}
