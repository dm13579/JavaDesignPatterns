package com.dm.example;

import com.dm.example.finery.BigTrouser;
import com.dm.example.finery.Sneakers;
import com.dm.example.finery.TShirt;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:client
 * @Description:TODO
 * @date 2019/12/10
 */
public class client {

    public static void main(String[] args) {
        Person person = new Person("dd");

        TShirt tShirt = new TShirt();
        BigTrouser bigTrouser = new BigTrouser();
        Sneakers sneakers = new Sneakers();
        tShirt.Decorate(person);
        bigTrouser.Decorate(tShirt);
        sneakers.Decorate(bigTrouser);
        sneakers.show();

    }
}
