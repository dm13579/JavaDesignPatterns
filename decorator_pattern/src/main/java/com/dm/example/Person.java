package com.dm.example;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Person
 * @Description:由于在此例中没有那么多的具体构件，就没必要在在具体构件上加抽象构件了。此时person对象为具体构件
 * @date 2019/12/10
 */
public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("装饰的"+name);
    }
}
