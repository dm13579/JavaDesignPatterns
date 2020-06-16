package com.dm.iterator;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:ConcreteAggregate
 * @Description:具体聚合
 * @date 2019/12/16
 */
public class ConcreteAggregate implements Aggregate{

    private List<Object> list = new ArrayList<Object>();

    @Override
    public void add(Object object) {
        list.add(object);
    }

    @Override
    public void remove(Object object) {
        list.remove(object);
    }

    @Override
    public Iterator getIterator() {
        return (new Concretelterator(list));
    }
}
