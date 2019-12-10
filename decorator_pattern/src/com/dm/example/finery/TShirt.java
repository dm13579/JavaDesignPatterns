package com.dm.example.finery;

import com.dm.example.Finery;
import com.dm.example.Person;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:TShirt
 * @Description:具体装饰
 * @date 2019/12/10
 */
public class TShirt extends Finery {

    @Override
    public void show() {
        System.out.println("Tshirt");
        super.show();
    }
}
