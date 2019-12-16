package com.dm.iterator;

import java.util.List;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Concretelterator
 * @Description:TODO
 * @date 2019/12/16
 */
public class Concretelterator implements Iterator {

    private List<Object> list = null;

    private int index=-1;

    public Concretelterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        Object object = list.get(index);
        return object;
    }

    @Override
    public Object next() {
        Object object = null;
        if(this.hasNext()){
            object = list.get(++index);
        }
        return object;
    }

    @Override
    public boolean hasNext() {
        if(index<list.size()-1){
            return true;
        }else{
            return false;
        }
    }
}
