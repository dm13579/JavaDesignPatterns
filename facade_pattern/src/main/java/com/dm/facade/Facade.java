package com.dm.facade;

import com.dm.facade.subsystem.SubSystem1;
import com.dm.facade.subsystem.SubSystem2;
import com.dm.facade.subsystem.SubSystem3;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Facade
 * @Description:外观角色
 * @date 2019/12/10
 */
public class Facade {

    private SubSystem1 subSystem1 = new SubSystem1();

    private SubSystem2 subSystem2 = new SubSystem2();

    private SubSystem3 subSystem3 = new SubSystem3();

    public void method(){
        subSystem1.method1();
        subSystem2.method2();
        subSystem3.method3();
    }

}
