package com.dm.observer.concreteobserver;

import com.dm.observer.Observer;

/**
  *                  ,;,,;
  *                ,;;'(    
  *      __      ,;;' ' \   
  *   /'  '\'~~'~' \ /'\.)  
  * ,;(      )    /  |.     
  *,;' \    /-.,,(   ) \    
  *     ) /       ) / )|    
  *     ||        ||  \)     
  *    (_\       (_\
  * @ClassName:ConcreteObserver 
  * @Description:具体观察者1
  * @author dm
  * @date 2019/12/18
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
public class ConcreteObserver1 implements Observer {

    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}
