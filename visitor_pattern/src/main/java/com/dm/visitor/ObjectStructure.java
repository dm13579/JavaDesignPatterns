package com.dm.visitor;

import java.util.ArrayList;
import java.util.Iterator;
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
  * @ClassName:ObjectStructure 
  * @Description:对象结构角色
  * @author dm
  * @date 2019/12/19
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
public class ObjectStructure {

    private List<Element> list = new ArrayList<>();

    public void accept(Visitor visitor){
        Iterator<Element> elements=list.iterator();
        while (elements.hasNext()){
            elements.next().accept(visitor);
        }
    }

    public void add(Element element){
        list.add(element);
    }

    public void remove(Element element){
        list.remove(element);
    }
}
