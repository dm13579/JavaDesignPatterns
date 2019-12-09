package com.dm.composite.safety;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:client
 * @Description:安全方式
 * @date 2019/12/9
 */
public class client {

    public static void main(String[] args) {
        Composite c0=new Composite();
        Composite c1=new Composite();
        Leaf leaf1=new Leaf("1");
        Leaf leaf2=new Leaf("2");
        Leaf leaf3=new Leaf("3");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
    }
}
