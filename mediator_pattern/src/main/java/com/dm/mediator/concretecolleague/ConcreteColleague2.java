package com.dm.mediator.concretecolleague;

import com.dm.mediator.Colleague;

/**
 * @author dm
 * @version V1.0
 * @ClassName:ConcreteColleague
 * @Description:具体同事类2
 * @date 2019/12/18
 */
public class ConcreteColleague2 extends Colleague {

    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        mediator.relay(this);
    }
}
