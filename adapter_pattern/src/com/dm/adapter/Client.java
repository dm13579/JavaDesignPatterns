package com.dm.adapter;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Client
 * @Description:TODO
 * @date 2019/12/4
 */
public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        Target target = new ObjectAdapter(adapter);
        target.request();
    }
}
