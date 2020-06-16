package com.dm.bridge;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:RefinedAbstraction
 * @Description:TODO
 * @date 2019/12/4
 */
public class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化角色被调用" );
        implementor.OperationImpl();
    }
}
