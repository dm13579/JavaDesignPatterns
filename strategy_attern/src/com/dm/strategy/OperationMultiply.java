package com.dm.strategy;

import com.dm.Strategy;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:OperationAdd
 * @Description:TODO
 * @date 2019/12/2
 */
public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
