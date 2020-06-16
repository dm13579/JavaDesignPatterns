package com.dm.visitor;
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
  * @InterfaceName:Element 
  * @Description:TODO
  * @author dm
  * @date 2019/12/19
  * @slogan: 天下风云出我辈，一入代码岁月催
  * @version V1.0
  */
public interface Element {

    public void accept(Visitor visitor);
}
