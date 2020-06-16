package com.dm.iterator;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Iterator
 * @Description:抽象迭代
 * @date 2019/12/16
 */
public interface Iterator {
    public Object first();

    public Object next();

    public boolean hasNext();
}
