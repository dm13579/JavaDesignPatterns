package com.dm.composite.safety;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Component
 * @Description:安全方式
 * @date 2019/12/9
 */
public interface Component {

    public Component getChild(int i);

    public void operation();
}
