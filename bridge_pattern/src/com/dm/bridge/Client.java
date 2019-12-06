package com.dm.bridge;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Client
 * @Description:客户端
 * @date 2019/12/4
 */
public class Client {

    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(implementor);
        refinedAbstraction.operation();
    }
}
