package com.dm.example;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Finery
 * @Description:抽象装饰
 * @date 2019/12/10
 */
public abstract class Finery extends Person{

    private Person person;

    public void Decorate(Person person){
        this.person = person;
    }

    @Override
    public void show() {
        person.show();
    }
}
