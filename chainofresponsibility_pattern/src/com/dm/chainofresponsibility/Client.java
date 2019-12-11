package com.dm.chainofresponsibility;

import com.dm.chainofresponsibility.concretehandler.ConcreteHandler1;
import com.dm.chainofresponsibility.concretehandler.ConcreteHandler2;
import com.dm.chainofresponsibility.concretehandler.ConcreteHandler3;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:client
 * @Description:责任链模式-客户端
 * @date 2019/12/11
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNext(handler2);
        handler2.setNext(handler3);
        handler1.handleRequest("two");
        handler1.handleRequest("three");
    }
}
