package com.dm.composite.safety;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Leaf
 * @Description:透明方式
 * @date 2019/12/9
 */
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
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
