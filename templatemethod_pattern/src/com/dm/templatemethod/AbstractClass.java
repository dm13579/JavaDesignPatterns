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
  * @ClassName:AbstractClass 
  * @Description:抽象类
  * @author dm
  * @date 2019/12/19
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
public abstract class AbstractClass {

    public void TemplateMethod(){
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    public void SpecificMethod(){
        System.out.println("抽象类中的具体方法被调用...");
    }

    public abstract void abstractMethod1();

    public abstract void abstractMethod2();
}
