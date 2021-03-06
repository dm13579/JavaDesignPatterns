package com.dm.chainofresponsibility.concretehandler;

import com.dm.chainofresponsibility.Handler;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:ConcreteHandler1
 * @Description://具体处理者角色2
 * @date 2019/12/11
 */
public class ConcreteHandler2 extends Handler{

    @Override
    public void handleRequest(String request) {
        if ("two".equals(request)) {
            System.out.println("具体处理者2负责处理该请求！");
        }else {
            if(getNext() != null){
                getNext().handleRequest(request);
            }else{
                System.out.println("没有人处理该请求");
            }
        }
    }
}
