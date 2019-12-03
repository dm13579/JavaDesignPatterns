package com.dm.prototype;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Client
 * @Description:TODO
 * @date 2019/12/3
 */
public class Client {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape = ShapeCache.getShape("1");
        System.out.println("Shape : "+cloneShape.getType());

        Shape cloneShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : "+cloneShape2.getType());

        Shape cloneShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : "+cloneShape3.getType());
    }
}
