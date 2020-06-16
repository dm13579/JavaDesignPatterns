package com.dm.memento;

/**
 * @author dm
 * @version V1.0
 * @ClassName:Client
 * @Description:备忘录模式-客户端
 * @date 2019/12/18
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("s0");
        System.out.println("初始状态"+originator.getState());
        caretaker.setMemento(originator.createMento());

        originator.setState("s1");
        System.out.println("新的状态" + originator.getState());

        originator.restoreMementro(caretaker.getMemento());
        System.out.println("恢复状态" + originator.getState());
    }
}
