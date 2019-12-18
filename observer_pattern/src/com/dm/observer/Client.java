package com.dm.observer;

import com.dm.observer.concreteobserver.ConcreteObserver1;
import com.dm.observer.concreteobserver.ConcreteObserver2;

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
  * @ClassName:Client 
  * @Description:观察者模式-客户端
  * @author dm
  * @date 2019/12/18
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
public class Client {

    public static void main(String[] args) {
        Subject concreteSubject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();

        concreteSubject.add(observer1);
        concreteSubject.add(observer2);

        concreteSubject.notityObserver();
    }
}
