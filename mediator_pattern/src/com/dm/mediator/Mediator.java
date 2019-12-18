package com.dm.mediator;

/**
 * @author Administrator
 * @version V1.0
 * @InterfaceName:Mediator
 * @Description:抽象中介者
 * @date 2019/12/17
 */
public interface Mediator {

    public void register(Colleague colleague);

    public void relay(Colleague colleague);
}
