package com.dm.state;

import com.dm.state.concretestate.ConcreteState1;
import com.dm.state.concretestate.ConcreteState2;

/**
  *                  ,;,,;
  *                ,;;'(    
  *      __      ,;;' ' \   
  *   /'  '\'~~'~' \ /'\.)  
  * ,;(      )    /  |.     
  *,;' \    /-.,,(   ) \    
  *     ) /       ) / )|    X
  *     ||        ||  \)     
  *    (_\       (_\
  * @ClassName:state 
  * @Description:状态模式-客户端
  * @author dm
  * @date 2019/12/18
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        context.Handle();
        context.Handle();
        context.Handle();
        context.Handle();

    }
}
