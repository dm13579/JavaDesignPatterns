package com.dm.command.concretecommand;

import com.dm.command.Command;
import com.dm.command.receiver.Receiver1;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:ConcreteCommand1
 * @Description:具体命令1
 * @date 2019/12/12
 */
public class ConcreteCommand1 implements Command{

    private Receiver1 receiver1;

    public ConcreteCommand1() {
        receiver1 = new Receiver1();
    }

    @Override
    public void execute() {
        receiver1.action();
    }
}
