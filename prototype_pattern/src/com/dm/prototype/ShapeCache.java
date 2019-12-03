package com.dm.prototype;

import com.dm.prototype.shape.Circle;
import com.dm.prototype.shape.Rectangle;
import com.dm.prototype.shape.Square;

import java.util.Hashtable;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:ShapeCache
 * @Description:TODO
 * @date 2019/12/3
 */
public class ShapeCache {

    private static Hashtable<String,Shape> shapeMap = new Hashtable<String,Shape>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
