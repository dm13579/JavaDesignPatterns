package com.dm.composite.transparent;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Leaf
 * @Description:透明方式
 * @date 2019/12/9
 */

// 树叶构件角色
public class Leaf implements Component{

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶"+name+"：被访问！");
    }
}
