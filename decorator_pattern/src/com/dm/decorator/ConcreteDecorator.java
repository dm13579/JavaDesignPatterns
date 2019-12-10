package com.dm.decorator;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:ConcreteDecorator
 * @Description:具体装饰构件
 * @date 2019/12/10
 */
public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addFunction();
    }

    public void addFunction(){
        System.out.println("为具体构件角色增加额外的功能addFunction()");
    }
}
