package com.dm.visitor;

import com.dm.visitor.concreteelement.ConcreteElement1;
import com.dm.visitor.concreteelement.ConcreteElement2;
import com.dm.visitor.concretevisitor.ConcreteVisitor1;
import com.dm.visitor.concretevisitor.ConcreteVisitor2;

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
  * @Description:访问者模式
  * @author dm
  * @date 2019/12/18
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure=new ObjectStructure();
        objectStructure.add(new ConcreteElement1());
        objectStructure.add(new ConcreteElement2());
        Visitor visitor=new ConcreteVisitor1();
        objectStructure.accept(visitor);
        System.out.println("------------------------");
        visitor=new ConcreteVisitor2();
        objectStructure.accept(visitor);
    }

}
