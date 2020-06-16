package com.dm.prototype.shape;

import com.dm.prototype.Shape;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Rectangle
 * @Description:TODO
 * @date 2019/12/3
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("invoke Rectangle下的draw");
    }
}
