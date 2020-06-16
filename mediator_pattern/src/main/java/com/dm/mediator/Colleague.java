package com.dm.mediator;

/**
 * @author Administrator
 * @version V1.0
 * @InterfaceName:Colleague
 * @Description:抽象同事类
 * @date 2019/12/18
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
