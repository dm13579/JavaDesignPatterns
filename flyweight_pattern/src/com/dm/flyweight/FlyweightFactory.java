package com.dm.flyweight;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:FlyweightFactory
 * @Description:享元工厂角色
 * @date 2019/12/11
 */
public class FlyweightFactory {

    private HashMap<String,Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key){
        Flyweight flyweight = flyweights.get(key);
        if (flyweight != null) {
            System.out.println("具体享元"+key+"已存在，被成功获取。");
        }else{
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key,flyweight);
        }
        return flyweight;
    }
}
