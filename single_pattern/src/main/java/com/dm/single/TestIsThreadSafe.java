package com.dm.single;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:testisThreadSafe
 * @Description:TODO 测试单例模式（懒加载）线程是否安全
 * @date 2019/12/2
 */
public class TestIsThreadSafe {
    public static void main(String[] args) {
        TestIsThreadSafe testIsThreadSafe = new TestIsThreadSafe();

        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    LazymanSingleton instance = LazymanSingleton.getInstance();
                    System.out.println(instance.hashCode());
                }
            }).start();
        }
    }
}
