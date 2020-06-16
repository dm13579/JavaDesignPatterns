package com.dm.command;

import com.dm.command.concretecommand.ConcreteCommand1;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Client
 * @Description:命令模式-客户端
 * @date 2019/12/11
 */
public class Client {
    public static void main(String[] args) {
        Command concreteCommand1 = new ConcreteCommand1();
        Command concreteCommand2 = new ConcreteCommand1();
        Invoke invoke = new Invoke();
        invoke.setConcreteCommand1(concreteCommand1);
        invoke.setConcreteCommand2(concreteCommand2);
        System.out.println("客户访问调用者调用命令1...");
        invoke.invokeConcreteCommand1();
        System.out.println("客户访问调用者调用命令2...");
        invoke.invokeConcreteCommand2();

    }
}
