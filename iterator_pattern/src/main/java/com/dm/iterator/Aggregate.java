package com.dm.iterator;

/**
 * @author Administrator
 * @version V1.0
 * @InterfaceName:Aggregate
 * @Description:抽象聚合
 * @date 2019/12/16
 */
public interface Aggregate {
    public void add(Object object);

    public void remove(Object object);

    public Iterator getIterator();
}
