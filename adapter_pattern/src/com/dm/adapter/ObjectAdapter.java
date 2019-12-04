package com.dm.adapter;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:ObjectAdapter
 * @Description:适配器
 * @date 2019/12/4
 */
public class ObjectAdapter implements Target{

    private Adapter adapter;

    public ObjectAdapter(Adapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void request() {
        adapter.specificRequest();
    }
}
