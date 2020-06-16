package com.dm.state;
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
  * @InterfaceName:State 
  * @Description:抽象状态角色
  * @author dm
  * @date 2019/12/18
  * @slogan: 天下风云出我辈，一入代码岁月催
  * @version V1.0
  */
public interface State {

    public void Handle(Context context);

}
