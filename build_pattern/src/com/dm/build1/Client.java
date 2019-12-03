package com.dm.build1;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Client
 * @Description:TODO
 * @date 2019/12/3
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();

        Director director = new Director(builder);

        Product product =director.construct();

        System.out.println(product.toString());

    }
}
