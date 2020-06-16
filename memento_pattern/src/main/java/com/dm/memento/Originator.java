package com.dm.memento;
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
  * @ClassName:Originator 
  * @Description:发起人
  * @author dm
  * @date 2019/12/18
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMento(){
        return new Memento(state);
    }

    public void restoreMementro(Memento memento){
        this.setState(memento.getState());
    }
}
