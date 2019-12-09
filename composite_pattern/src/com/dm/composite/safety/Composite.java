package com.dm.composite.safety;

import java.util.ArrayList;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Composite
 * @Description:安全方式
 * @date 2019/12/9
 */
public class Composite implements Component {

    private ArrayList<Component> children = new ArrayList<Component>();

    public void add(Component component) {
        children.add(component);
    }

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
