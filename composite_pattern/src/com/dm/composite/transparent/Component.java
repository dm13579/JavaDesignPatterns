package com.dm.composite.transparent;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Component
 * @Description:透明方式
 * @date 2019/12/9
 */

// 抽象构件角色
public interface Component {

    public void add(Component component);

    public void remove(Component component);

    public Component getChild(int i);

    public void operation();
}
