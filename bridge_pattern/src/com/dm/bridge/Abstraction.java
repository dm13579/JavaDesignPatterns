package com.dm.bridge;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Abstraction
 * @Description:抽象化角色
 * @date 2019/12/4
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
