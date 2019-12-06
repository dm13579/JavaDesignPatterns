package com.dm.bridge;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:ConcreteImplementorA
 * @Description:扩展抽象化角色
 * @date 2019/12/4
 */
public class ConcreteImplementorA implements Implementor {

    @Override
    public void OperationImpl() {
        System.out.println("具体实现化角色被调用");
    }
}
