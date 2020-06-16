package com.dm.composite.transparent;

import java.util.ArrayList;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Composite
 * @Description:透明方式
 * @date 2019/12/9
 */

// 树枝构件角色
public class Composite implements Component{

    private ArrayList<Component> children = new ArrayList<Component>();

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Object object:children){
            ((Component)object).operation();
        }
    }
}
