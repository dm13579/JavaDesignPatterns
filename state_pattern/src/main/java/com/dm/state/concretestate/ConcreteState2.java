package com.dm.state.concretestate;

import com.dm.state.Context;
import com.dm.state.State;

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
  * @ClassName:ConcreteState 
  * @Description:具体状态角色2
  * @author dm
  * @date 2019/12/18
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
public class ConcreteState2 implements State {

    @Override
    public void Handle(Context context) {
        System.out.println("具体状态角色2处理");
        context.setState(new ConcreteState1());
    }
}
