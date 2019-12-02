package com.dm;

import com.dm.strategy.OperationAdd;
import com.dm.strategy.OperationMultiply;
import com.dm.strategy.OperationSub;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:test
 * @Description:TODO
 * @date 2019/12/2
 */
public class test {

    private static int num1 = 19;
    private static int num2 = 25;

    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println(num1 + "+" + num2 + "=" + context.executeStrategy(num1,num2));

        Context context1 = new Context(new OperationSub());
        System.out.println(num1 + "-" + num2 + "=" + context1.executeStrategy(num1,num2));

        Context context2 = new Context(new OperationMultiply());
        System.out.println(num1 + "*" + num2 + "=" + context2.executeStrategy(num1,num2));

    }
}
