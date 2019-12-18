package com.dm.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:ConcreteMediator
 * @Description: 具体抽象者类
 * @date 2019/12/18
 */
public class ConcreteMediator implements Mediator{

    public List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if(!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for(Colleague c:colleagues){
            if(!c.equals(colleague)){
                c.receive();
            }
        }
    }
}
