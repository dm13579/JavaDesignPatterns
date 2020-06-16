package com.dm.templatemethod;
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
  * @Description:模板方法模式-客户端
  * @author dm
  * @date 2019/12/18
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();

        abstractClass.TemplateMethod();;
    }
}
