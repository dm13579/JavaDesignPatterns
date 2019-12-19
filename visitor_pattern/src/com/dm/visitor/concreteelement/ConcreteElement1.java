package com.dm.visitor.concreteelement;

import com.dm.visitor.Element;
import com.dm.visitor.Visitor;

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
  * @ClassName:ConcreteElement1 
  * @Description:具体元素1
  * @author dm
  * @date 2019/12/19
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
public class ConcreteElement1 implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String Operation1(){
        return "具体元素1的操作。";
    }
}
