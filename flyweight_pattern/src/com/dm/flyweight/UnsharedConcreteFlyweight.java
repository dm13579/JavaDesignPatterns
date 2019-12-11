package com.dm.flyweight;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:UnsharedConcreteFlyweight
 * @Description:非享元角色
 * @date 2019/12/11
 */
public class UnsharedConcreteFlyweight {

    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
