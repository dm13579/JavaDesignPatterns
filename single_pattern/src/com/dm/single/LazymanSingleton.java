package com.dm.single;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:HungrymanSingleton
 * @Description:TODO 单例模式懒汉模式
 * @date 2019/12/2
 */
public class LazymanSingleton {

//    private static LazymanSingleton instance;
//
//    private LazymanSingleton(){
//
//    }
//
//    public static LazymanSingleton getInstance(){
//        if(instance == null){
//            synchronized(LazymanSingleton.class){
//                if(instance == null){
//                    instance = new LazymanSingleton();
//                }
//            }
//
//        }
//        return instance;
//    }

    private LazymanSingleton(){

    }
    // 静态内部类单例，类加载阶段不会初始化instance,而是在调用getInstance方法来实现实例化，原理是第一次调用时会加载内部类SingletonHolder，
    // 在内部类定义一个带final static修饰的instance变量（保证实例的唯一性），
    // 同时初始化Singleton实例，由java虚拟机来保证线程安全。
    public static class SingletonHolder{
        private final static LazymanSingleton instance = new LazymanSingleton();
    }

    public static LazymanSingleton getInstance(){
        return SingletonHolder.instance;
    }

}
