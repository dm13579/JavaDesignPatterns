package com.dm.build.base;

/**
 * @author Administrator
 * @version V1.0
 * @InterfaceName:Item
 * @Description: 食物类接口
 * @date 2019/12/3
 */
public interface Item {

    public String name();

    public Packing packing();

    public float price();
}
