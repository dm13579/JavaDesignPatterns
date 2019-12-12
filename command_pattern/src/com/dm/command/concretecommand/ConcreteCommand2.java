package com.dm.command.concretecommand;

import com.dm.command.Command;
import com.dm.command.receiver.Receiver1;
import com.dm.command.receiver.Receiver2;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:ConcreteCommand1
 * @Description:具体命令2
 * @date 2019/12/12
 */
public class ConcreteCommand2 implements Command{

    private Receiver2 receiver2;

    public ConcreteCommand2() {
        receiver2 = new Receiver2();
    }

    @Override
    public void execute() {
        receiver2.action();
    }
}
