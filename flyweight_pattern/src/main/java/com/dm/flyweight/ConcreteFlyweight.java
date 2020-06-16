package com.dm.flyweight;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:ConcreteFlyweight
 * @Description:具体享元角色
 * @date 2019/12/11
 */
public class ConcreteFlyweight implements Flyweight{

    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元角色"+key+"被创建");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.print("具体享元"+key+"被调用，");
        System.out.println("非享元信息是:"+outState.getInfo());
    }
}
