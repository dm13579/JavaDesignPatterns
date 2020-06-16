package com.dm.decorator;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:ConcreteComponent
 * @Description:具体构件
 * @date 2019/12/10
 */
public class ConcreteComponent implements Component {

    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}

