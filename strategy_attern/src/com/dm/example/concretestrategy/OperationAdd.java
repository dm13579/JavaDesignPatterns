package com.dm.example.concretestrategy;

import com.dm.example.Strategy;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:OperationAdd
 * @Description:TODO
 * @date 2019/12/2
 */
public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
