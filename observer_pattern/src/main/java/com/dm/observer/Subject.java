package com.dm.observer;

import java.util.ArrayList;
import java.util.List;

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
  * @InterfaceName:Subject 
  * @Description:抽象主题角色
  * @author dm
  * @date 2019/12/18
  * @slogan: 天下风云出我辈，一入代码岁月催
  * @version V1.0
  */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public abstract void notityObserver();
}
