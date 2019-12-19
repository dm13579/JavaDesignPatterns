package com.dm.visitor;

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
  * @InterfaceName:Visitor 
  * @Description:抽象访问者角色
  * @author dm
  * @date 2019/12/19
  * @slogan: 天下风云出我辈，一入代码岁月催
  * @version V1.0
  */
public interface Visitor {

    public void visit(ConcreteElement1 concreteElement1);

    public void visit(ConcreteElement2 concreteElement2);

}
