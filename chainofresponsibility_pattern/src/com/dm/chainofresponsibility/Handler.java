package com.dm.chainofresponsibility;

/**
 * @author Administrator
 * @version V1.0
 * @InterfaceName:Handler
 * @Description:抽象处理者角色
 * @date 2019/12/11
 */
public abstract class Handler {

    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    // 处理请求的方法
    public abstract void handleRequest(String request);
}
