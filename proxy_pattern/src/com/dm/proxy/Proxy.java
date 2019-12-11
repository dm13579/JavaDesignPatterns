package com.dm.proxy;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Proxy
 * @Description:代理类
 * @date 2019/12/11
 */
public class Proxy implements Subject{

    private RealSubject realSubject;

    public void preRequest(){
        System.out.println("访问真实主题之前的预处理。");
    }

    public void postRequest(){
        System.out.println("访问真实主题之后的后续处理。");
    }

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }
}