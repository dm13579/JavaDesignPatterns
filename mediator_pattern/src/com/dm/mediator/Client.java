package com.dm.mediator;

import com.dm.mediator.concretecolleague.ConcreteColleague1;
import com.dm.mediator.concretecolleague.ConcreteColleague2;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Client
 * @Description:中介者模式-客户端
 * @date 2019/12/17
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1();
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2();
        mediator.register(concreteColleague1);
        mediator.register(concreteColleague2);

        concreteColleague1.send();
        System.out.println("=========================");
        concreteColleague2.send();
    }
}
