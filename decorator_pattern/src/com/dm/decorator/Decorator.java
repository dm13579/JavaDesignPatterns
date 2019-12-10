package com.dm.decorator;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Decorator
 * @Description:抽象装饰构件
 * @date 2019/12/10
 */
public abstract class Decorator implements Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
