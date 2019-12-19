package com.dm.visitor.concretevisitor;

import com.dm.visitor.Visitor;
import com.dm.visitor.concreteelement.ConcreteElement1;
import com.dm.visitor.concreteelement.ConcreteElement2;

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
  * @ClassName:ConcreteVisitor 
  * @Description:具体访问者1
  * @author dm
  * @date 2019/12/19
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
public class ConcreteVisitor1 implements Visitor{

    @Override
    public void visit(ConcreteElement1 concreteElement1) {
        System.out.println("具体访问者1访问-->"+concreteElement1.Operation1());
    }

    @Override
    public void visit(ConcreteElement2 concreteElement2) {
        System.out.println("具体访问者1访问-->"+concreteElement2.Operation2());
    }
}
