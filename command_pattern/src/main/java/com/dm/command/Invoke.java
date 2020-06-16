package com.dm.command;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Invoke
 * @Description:请求者
 * @date 2019/12/12
 */
public class Invoke {

    private Command concreteCommand1,concreteCommand2;

    public void setConcreteCommand1(Command concreteCommand1) {
        this.concreteCommand1 = concreteCommand1;
    }

    public void setConcreteCommand2(Command concreteCommand2) {
        this.concreteCommand2 = concreteCommand2;
    }

    public void invokeConcreteCommand1(){
        System.out.println("调用者执行命令ConcreteCommand1...");
        concreteCommand1.execute();
    }
    public void invokeConcreteCommand2(){
        System.out.println("调用者执行命令ConcreteCommand2...");
        concreteCommand2.execute();
    }

}
