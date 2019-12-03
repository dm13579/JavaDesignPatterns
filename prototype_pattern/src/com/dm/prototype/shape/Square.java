package com.dm.prototype.shape;

import com.dm.prototype.Shape;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Rectangle
 * @Description:TODO
 * @date 2019/12/3
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("invoke Square下的draw");
    }
}
